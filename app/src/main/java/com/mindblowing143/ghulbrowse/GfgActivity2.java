package com.mindblowing143.ghulbrowse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GfgActivity2 extends AppCompatActivity {

    WebView wbgfg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gfg2);

        wbgfg = findViewById(R.id.wbgfg);
        wbgfg.setWebViewClient(new WebViewClient());
        wbgfg.loadUrl("https://www.geeksforgeeks.org/");

    }
    @Override
    public void onBackPressed() {
        if(wbgfg.canGoBack()){
            wbgfg.goBack();
        }else{
            super.onBackPressed();
        }

    }

}