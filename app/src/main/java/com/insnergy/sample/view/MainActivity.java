/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.view;

import android.app.Activity;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.insnergy.sample.R;
import com.insnergy.sample.domainobj.ApiResult;
import com.insnergy.sample.model.ApiCallback;
import com.insnergy.sample.presenter.SignPresenter;

public class MainActivity extends Activity {

    private SignPresenter mSignPresenter = SignPresenter.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(mSignPresenter.getAuthorizeUrl());
        webView.setWebViewClient(new WebViewClient() {
            boolean authComplete = false;

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (url.contains("?code=") && authComplete != true) {
                    authComplete = true;
                    mSignPresenter.getAccessToken(url, new ApiCallback() {
                        @Override
                        public void onSuccess(ApiResult apiResult) {
                            Toast.makeText(getApplicationContext(),"Login Success", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(ApiResult apiResult) {
                            Toast.makeText(getApplicationContext(),"Login Failure", Toast.LENGTH_SHORT).show();
                        }
                    });
                } else if (url.contains("signout")) {
                    authComplete = true;
                } else if (url.contains("error=access_denied")) {
                    authComplete = false;
                    Toast.makeText(getApplicationContext(), "Error Occurred", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();// ignore ssl error
            }
        });
    }
}
