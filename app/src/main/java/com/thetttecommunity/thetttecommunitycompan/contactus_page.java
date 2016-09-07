package com.thetttecommunity.thetttecommunitycompan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class contactus_page extends AppCompatActivity {
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials_page);

        iv1 = (ImageView) findViewById(R.id.imageView);
        iv1.setBackgroundResource(R.drawable.helpmepls);

        AdView mAdView = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(contactus_page.this, homepage.class);
        startActivity(intent);
        finish();

    }

}
