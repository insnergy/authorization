/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import com.google.gson.Gson;
import com.insnergy.sample.domainobj.ApiResult;

import java.util.HashMap;

class ApiCacheManager {
    private static final int MAX_CACHE_SIZE = 80;
    private static final long EXPIRED_TIME = 3*60*1000; // 3 mins
    private static ApiCacheManager apiCacheManager = new ApiCacheManager();
    private static HashMap<String, CachedData> cachedDataHashMap = new HashMap<String, CachedData>();

    private class CachedData {
        private String urlParam = null;
        private String apiResultStr = null;
        private long timestamp = 0;

        CachedData(String urlParam, ApiResult apiResult) {
            this.urlParam = urlParam;
            this.apiResultStr = new Gson().toJson(apiResult);
            this.timestamp = System.currentTimeMillis();
        }

        public ApiResult getApiResult() {
            return (isValid())? new Gson().fromJson(apiResultStr, ApiResult.class): null;
        }

        public boolean isValid() {
            if (this.apiResultStr == null) {
                return false;
            }
            if ((System.currentTimeMillis()-this.timestamp) > EXPIRED_TIME) {
                return false;
            }
            return true;
        }
    }

    public static ApiCacheManager getInstance() {
        return apiCacheManager;
    }

    public void cacheApiResult(String serverName, String urlParam, ApiResult result) {
        optimizeCache();
        CachedData cachedData = new CachedData(urlParam, result);
        cachedDataHashMap.put(urlParam, cachedData);
    }

    public ApiResult getCachedApiResult(String server, String urlParam) {
        if (cachedDataHashMap.get(urlParam) != null) {
            if (cachedDataHashMap.get(urlParam).isValid()) {
                return cachedDataHashMap.get(urlParam).getApiResult();
            } else {
                cachedDataHashMap.remove(urlParam);
            }
        }
        return null;
    }

    public void clearCachedApiResult(String serverName, String urlParam) {
        cachedDataHashMap.remove(urlParam);
    }

    public void clearAllCache() {
        cachedDataHashMap.clear();
    }

    private void optimizeCache() {
        if (cachedDataHashMap.size() >= MAX_CACHE_SIZE) {
            clearAllCache();
        }
    }
}
