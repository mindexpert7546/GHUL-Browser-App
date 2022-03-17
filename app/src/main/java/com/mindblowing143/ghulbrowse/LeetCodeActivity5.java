package com.mindblowing143.ghulbrowse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LeetCodeActivity5 extends AppCompatActivity {

    WebView wbleetcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leet_code5);
        wbleetcode = findViewById(R.id.wbleetcode);
        wbleetcode.setWebViewClient(new WebViewClient());
        wbleetcode.loadUrl("https://leetcode.com/");

    }

    @Override
    public void onBackPressed() {
        if (wbleetcode.canGoBack()) {
            wbleetcode.goBack();
        } else {
            super.onBackPressed();
        }

    }
}