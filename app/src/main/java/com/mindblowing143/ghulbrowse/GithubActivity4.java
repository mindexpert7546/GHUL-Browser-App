package com.mindblowing143.ghulbrowse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GithubActivity4 extends AppCompatActivity {

    WebView wbgit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github4);

        wbgit = findViewById(R.id.wbgit);
        wbgit.setWebViewClient(new WebViewClient());
        wbgit.loadUrl("https://www.github.com/");

    }

    @Override
    public void onBackPressed() {
        if (wbgit.canGoBack()) {
            wbgit.goBack();
        } else {
            super.onBackPressed();
        }

    }
}
