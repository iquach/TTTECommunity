package com.thetttecommunity.thetttecommunitycompan;


import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.squareup.picasso.Picasso;

public class SocialMedaPage extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_meda_page);

        ImageView iv = (ImageView) findViewById(R.id.title_admins);
        ImageView iv1 = (ImageView) findViewById(R.id.d1);
        ImageView iv2 = (ImageView) findViewById(R.id.facebookDiesel);
        ImageView iv3 = (ImageView) findViewById(R.id.twitterdiesel);
        ImageView iv4 = (ImageView) findViewById(R.id.insta);
        ImageView iv5 = (ImageView) findViewById(R.id.tumbler);

        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443" +
                "/patsviper46/title_logo_zpsy36h8s7d.png").into(iv);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/diesel_font_zpss9gp5gvn.png").into(iv1);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/facebook_logo_zpshw1bp6mq.png").fit().centerCrop().into(iv2);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/twitter_logo_zpswqppmpdv.png").fit().centerCrop().into(iv3);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/instagram_zpssa270rmy.png").fit().centerCrop().into(iv4);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/tumblr_logo_zpsdlktqs2n.png").fit().centerCrop().into(iv5);

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

}