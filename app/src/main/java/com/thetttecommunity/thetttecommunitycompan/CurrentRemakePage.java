package com.thetttecommunity.thetttecommunitycompan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CurrentRemakePage extends AppCompatActivity {
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_remake_page);

        myWebView = (WebView) findViewById(R.id.webview_current_remake);
        WebSettings myWebSetting = myWebView.getSettings();
        myWebSetting.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://www.thetttecommunity.com/current-remake-info.html");
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(CurrentRemakePage.this, homepage.class);
        startActivity(intent);
        finish();
        myWebView.destroyDrawingCache();
    }

}
