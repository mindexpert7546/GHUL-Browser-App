package com.mindblowing143.ghulbrowse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class UdemyActivity3 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udemy3);

        webView = findViewById(R.id.wbudemy);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.udemy.com/");


    }

    @Override
    public void onBackPressed() {

        if(webView.canGoBack()){
            webView.canGoBack();
        }
        else {
            super.onBackPressed();
        }
    }
}