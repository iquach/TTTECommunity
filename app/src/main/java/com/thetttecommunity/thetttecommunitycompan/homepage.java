package com.thetttecommunity.thetttecommunitycompan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class homepage extends AppCompatActivity {

    private ImageView ivImage1;
    private ImageView ivImage2;
    private ImageView ivImage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Bottom two lines of code are for the Blue toolbar

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        // This is whole method is for the floating mail button.

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

      /*  ivImage1 = (ImageView) findViewById(R.id.logo);
        *//*Picasso.with(ivImage1.getContext())
                .load(R.drawable.channel_logo)
                .resize(500, 600)
                .centerCrop()
                .into(ivImage1);*//*
       Picasso.with(ivImage1.getContext()).load(R.drawable.logo_small)
                .into(ivImage1);

        ivImage2 = (ImageView) findViewById(R.id.thomas_face);
        *//*Picasso.with(ivImage2.getContext())
                .load(R.drawable.yt_thumb)
                .resize(200, 200)
                .centerCrop()
                .into(ivImage2);*//*
        Picasso.with(ivImage2.getContext()).load(R.drawable.yt_thumb)
                .into(ivImage2);*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }

    // Methods that direct the user to the website.

   public void goToYoutube (View view) {
       goToUrl("https://www.youtube.com/user/thetttecommunity/featured");
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

}
