package com.thetttecommunity.thetttecommunitycompan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class tutorials extends AppCompatActivity {

    Button tutorialButton1, tutorialButton2, tutorialButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        tutorialButton1 = (Button) findViewById(R.id.button);
        tutorialButton2 = (Button) findViewById(R.id.ytlink2);
        tutorialButton2 = (Button) findViewById(R.id.ytlink3);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void gotoHowToRemakeClip (View view) { goToUrl("https://www.youtube.com/watch?v=CXQnNNqPjqk"); }

    public void gotoAuditionToVoice (View view) { goToUrl("https://www.youtube.com/watch?v=as9SrhhGRsM"); }

    public void gotoVotingRules (View view) { goToUrl("https://www.youtube.com/watch?v=mEl71nUUooM"); }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
