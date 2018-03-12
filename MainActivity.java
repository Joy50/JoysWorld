package com.joy50.joysworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView w;

    @Override
    public void onBackPressed() {
        if(w.canGoBack()){
            w.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w=(WebView)findViewById(R.id.webview);
        WebSettings ws=w.getSettings();
        ws.setJavaScriptEnabled(true);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("http://joy50world.blogspot.com");
    }
}
