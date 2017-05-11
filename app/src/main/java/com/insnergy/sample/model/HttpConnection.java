/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import android.util.Log;

import com.insnergy.sample.model.Constants.HttpMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

class HttpConnection {
    private static final String TAG = "HttpConnection";
    private static final int TIMEOUT__MILLISECONDS = 60 * 1000;

    private String mContentType;

    public class AllTrustVerifier implements HostnameVerifier {
        @Override
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    }

    public class AllTrustManager implements X509TrustManager {
        @Override
        public void checkClientTrusted(final X509Certificate[] chain,
                                       final String authType) throws CertificateException { }

        @Override
        public void checkServerTrusted(final X509Certificate[] chain,
                                       final String authType) throws CertificateException { }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public HttpConnection(String contentType) {
        this.mContentType = contentType;
    }

    public String httpCall(HttpMethod httpMethod, String url, String httpAuth) {
        Log.i(TAG, httpMethod.getCode() + " " + url);
        Log.i(TAG, "" + httpAuth);
        String result = "";
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new AllTrustVerifier());
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(null, new X509TrustManager[]{new AllTrustManager()}, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
            HttpsURLConnection urlConnection = getHttpsURLConnection(url, httpMethod, httpAuth);
            urlConnection.connect();
            int status = urlConnection.getResponseCode();
            BufferedReader br;
            StringBuilder sb;
            String line;
            switch (status) {
                case 200:
                case 201:
                    br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    sb = new StringBuilder();
                    while ((line = br.readLine()) != null) {
                        sb.append(line + "\n");
                    }
                    br.close();
                    result = sb.toString();
                    break;
                case 401:
                case 400:
                    br = new BufferedReader(new InputStreamReader(urlConnection.getErrorStream()));
                    sb = new StringBuilder();
                    while ((line = br.readLine()) != null) {
                        sb.append(line + "\n");
                    }
                    br.close();
                    result = sb.toString();
                    break;
            }
            urlConnection.disconnect();
        } catch (SocketTimeoutException e) {
            // FIXME: Send a timeout msg to ApiCallback, need to be confirmed.
            return ErrCode.App.SERVER_OFFLINE.getErrCode();
        } catch (java.net.UnknownHostException e) {
            return ErrCode.App.SERVER_OFFLINE.getErrCode();
        } catch (Exception e) {
            e.printStackTrace();
            return ErrCode.App.SERVER_OFFLINE.getErrCode();
        }
        return result;
    }

    private HttpsURLConnection getHttpsURLConnection(String url, HttpMethod httpMethod, String authorization) {
        HttpsURLConnection urlConnection = null;
        try {
            String myUrl = url;
            String myData = "";

            if (HttpMethod.POST.equals(httpMethod) || HttpMethod.PUT.equals(httpMethod)) {
                myUrl = url.substring(0, url.indexOf("?"));
                myData = url.substring(url.indexOf("?") + 1, url.length());
            }

            URL httpUrl = new URL(myUrl);
            urlConnection = (HttpsURLConnection) httpUrl.openConnection();
            if (authorization != null) {
                urlConnection.setRequestProperty("Authorization", authorization);
            }
            urlConnection.setRequestProperty("Content-Type", mContentType);
            urlConnection.setRequestMethod(httpMethod.getCode());
            urlConnection.setConnectTimeout(TIMEOUT__MILLISECONDS);
            urlConnection.setReadTimeout(TIMEOUT__MILLISECONDS);

            if (HttpMethod.POST.equals(httpMethod) || HttpMethod.PUT.equals(httpMethod)) {
                urlConnection.setDoOutput(true);

                byte[] outputInBytes = myData.getBytes();
                OutputStream os = urlConnection.getOutputStream();
                os.write(outputInBytes);
                os.flush();
                os.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return urlConnection;
    }
}
