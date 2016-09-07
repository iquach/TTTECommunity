package com.thetttecommunity.thetttecommunity1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.thetttecommunity.thetttecommunitycompan.R;
import com.thetttecommunity.thetttecommunitycompan.homepage;

public class Audition extends AppCompatActivity {
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audition);

        myWebView = (WebView) findViewById(R.id.webview_aud);
        //WebSettings myWebSetting = myWebView.getSettings();
        //yWebSetting.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://www.thetttecommunity.com/auditions.html");
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Audition.this, homepage.class);
        startActivity(intent);
        finish();
        myWebView.destroy();
    }

}
