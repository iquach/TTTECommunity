package com.thetttecommunity.thetttecommunitycompan;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.squareup.picasso.Picasso;
import com.thetttecommunity.thetttecommunity1.Audition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class homepage extends AppCompatActivity {
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton9;
    ImageButton imageButton10;
    ImageButton imageButton11;
    ScrollView bg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        bg = (ScrollView) findViewById(R.id.background);
        bg.setBackgroundResource(R.drawable.homepage_hd);

        final ImageView imageView = (ImageView) findViewById(R.id.thomas_face);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/" +
                "logo_thumb_zpsvrfqyihl.png").fit().
                centerCrop().into(imageView);


        imageButton1 = (ImageButton) findViewById(R.id.cloud_home);
        imageButton2 = (ImageButton) findViewById(R.id.cloud_current_remake);
        imageButton3 = (ImageButton) findViewById(R.id.cloud_tutorial);

        imageButton4 = (ImageButton) findViewById(R.id.cloud_aud);
        imageButton5 = (ImageButton) findViewById(R.id.cloud_wat);
        imageButton6 = (ImageButton) findViewById(R.id.cloud_past_project);

        imageButton7 = (ImageButton) findViewById(R.id.cloud_quiz);
        imageButton8 = (ImageButton) findViewById(R.id.cloud_about);
        imageButton9 = (ImageButton) findViewById(R.id.cloud_contact);

        imageButton3.setBackgroundResource(R.drawable.empty_cloud_tutorials);
        imageButton2.setBackgroundResource(R.drawable.empty_cloud_current_remake);
        imageButton1.setBackgroundResource(R.drawable.empty_cloud_twitter);


        imageButton4.setBackgroundResource(R.drawable.empty_cloud_auditions);
        imageButton5.setBackgroundResource(R.drawable.empty_cloud_waitlist);
        imageButton6.setBackgroundResource(R.drawable.empty_cloud_pastproject);

        imageButton7.setBackgroundResource(R.drawable.empty_cloud_quiz);
        imageButton8.setBackgroundResource(R.drawable.empty_cloud_about);
        imageButton9.setBackgroundResource(R.drawable.empty_cloud_contact);

        imageButton10 = (ImageButton) findViewById(R.id.cloud_facebook);
        imageButton11 = (ImageButton) findViewById(R.id.cloud_wikia);

        imageButton11.setBackgroundResource(R.drawable.empty_cloud_wikia);
        imageButton10.setBackgroundResource(R.drawable.empty_cloud_facebook);

        /*Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/empty_" +
                "cloud_facebook_zps9ss6ob1n.png").fit().centerCrop().into(imageButton10);

        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/patsviper46/empty_" +
                "cloud_wikia_zpsuygshk3l.png").fit().centerCrop().into(imageButton11);*/


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, contactus_page.class);
                startActivity(intent);
                finish();
                return;
                //clearTheMemoryImages();
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, CurrentRemakePage.class);
                startActivity(intent);
                finish();
               // clearTheMemoryImages();
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, tutorials.class);
                startActivity(intent);
                finish();
                //clearTheMemoryImages();
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, Audition.class);
                startActivity(intent);
                finish();
               // clearTheMemoryImages();
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, loadingscreenofquiz.class);
                startActivity(intent);
                finish();
                //clearTheMemoryImages();
            }
        });

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, AboutUs.class);
                startActivity(intent);
                finish();
                //clearTheMemoryImages();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }

    // Methods that direct the user to the website.

   public void goToYoutube (View view) {
       goToUrl("https://www.youtube.com/watch?v=5ZIsq-mTQ9I");
    }

    public void goToTwitter(View view) {
        goToUrl("https://twitter.com/tttecommunity");
    }

    public void goToFacebook(View view) {
        goToUrl("https://facebook.com/thetttecommunity");
    }

    public void goToPastP(View view) {
        goToUrl("https://www.youtube.com/playlist?list=PL2oQR5EQqTgGr6qTtMXLKBqbTEd6PK3vV");
    }

    public void goToWaitList(View view) {
        goToUrl("https://tttecommunity.wufoo.com/forms/z153ewir184yych");
    }

    public void goToWiki(View view) {
        goToUrl("http://the-ttte-community.wikia.com/wiki/The_TTTE_Community_Wiki");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   /* private void clearTheMemoryImages(){
        imageButton10.destroyDrawingCache();
        imageButton1.destroyDrawingCache();
        imageButton2.destroyDrawingCache();
        imageButton3.destroyDrawingCache();
        imageButton4.destroyDrawingCache();
        imageButton5.destroyDrawingCache();
        imageButton6.destroyDrawingCache();
        imageButton7.destroyDrawingCache();
        imageButton8.destroyDrawingCache();
        imageButton11.destroyDrawingCache();
        imageButton9.destroyDrawingCache();
        bg.destroyDrawingCache();
    }*/

    // Decodes image and scales it to reduce memory consumption
    private Bitmap decodeFile(File f) {
        try {
            // Decode image size
            BitmapFactory.Options o = new BitmapFactory.Options();
            o.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(f), null, o);

            // The new size we want to scale to
            final int REQUIRED_SIZE=70;

            // Find the correct scale value. It should be the power of 2.
            int scale = 1;
            while(o.outWidth / scale / 2 >= REQUIRED_SIZE &&
                    o.outHeight / scale / 2 >= REQUIRED_SIZE) {
                scale *= 2;
            }

            // Decode with inSampleSize
            BitmapFactory.Options o2 = new BitmapFactory.Options();
            o2.inSampleSize = scale;
            return BitmapFactory.decodeStream(new FileInputStream(f), null, o2);
        } catch (FileNotFoundException e) {}
        return null;
    }

}
