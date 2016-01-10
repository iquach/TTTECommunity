package com.thetttecommunity.thetttecommunitycompan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SocialMedaPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_meda_page);

        ImageView iv = (ImageView) findViewById(R.id.title_admins);
        ImageView iv1 = (ImageView) findViewById(R.id.d1);
        ImageView iv7 = (ImageView) findViewById(R.id.ee93name);
        ImageView iv12 = (ImageView) findViewById(R.id.pe619_name);
        ImageView iv17 = (ImageView) findViewById(R.id.skj_name);

        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443" +
                "/patsviper46/title_logo_zpsy36h8s7d.png").into(iv);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/diesel_font_zpss9gp5gvn.png").into(iv1);

        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/enterprisingengine_font_zpsmgntdqpl.png").into(iv7);

        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/pe619_font_zpsyqnmzxwe.png").into(iv12);

        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/skj_font_zps0wpjsx2p.png").into(iv17);


    }

    //Diesels Social Media Pages

    public void DieselFacebook(View view) {
        goToUrl("https://www.facebook.com/DieselD199");
    }
    public void DieselTwitter(View view) {
        goToUrl("https://twitter.com/dieseld199");
    }

    public void DieselInsta(View view) {
        goToUrl("https://www.instagram.com/dieseld199/");
    }

    public void DieselTumblr(View view) {
        goToUrl("http://dieseld199.tumblr.com/");
    }

    public void DieselGPlus(View view) {
        goToUrl("https://plus.google.com/+DieselD199/posts");
    }

    //EE social Media

    public void EEFacebook(View view) {
        goToUrl("https://www.facebook.com/EnterprisingEngine93?ref=notif&notif_t=page_new_likes");
    }
    public void EETwitter(View view) {
        goToUrl("https://twitter.com/EEngine93");
    }

    public void EEWikia(View view) {
        goToUrl("http://enterprisingengine93.wikia.com/wiki/Main_Page");
    }

    public void EEGPlus(View view) {
        goToUrl("https://plus.google.com/105340335056202785758/posts");
    }

    //PE Social Media

    public void PETwitter(View view) {
        goToUrl("https://twitter.com/Percyengine619");
    }
    public void PEBlogger(View view) {
        goToUrl("http://percyengine619.blogspot.com/");
    }

    public void PEDaily(View view) {
        goToUrl("http://www.dailymotion.com/Percyengine619");
    }

    public void PEGPlus(View view) {
        goToUrl("https://plus.google.com/+Percyengine619/posts");
    }

    //SKJ Social Media

    public void SKJFacebook(View view) {
        goToUrl("https://www.facebook.com/sidekickjason/");
    }
    public void SKJTwitter(View view) {
        goToUrl("https://twitter.com/Sidekickjason");
    }

    public void SKJBlogger(View view) {
        goToUrl("http://www.sidekickjason.blogspot.com/");
    }

    public void SKJGPlus(View view) {
        goToUrl("https://plus.google.com/+Sidekickjason/posts");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}