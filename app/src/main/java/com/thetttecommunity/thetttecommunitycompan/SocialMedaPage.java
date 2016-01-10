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
        ImageView iv2 = (ImageView) findViewById(R.id.facebookDiesel);
        ImageView iv3 = (ImageView) findViewById(R.id.twitterdiesel);
        ImageView iv4 = (ImageView) findViewById(R.id.insta);
        ImageView iv5 = (ImageView) findViewById(R.id.tumbler);
        ImageView iv6 = (ImageView) findViewById(R.id.googleplusdiesel);
        ImageView iv7 = (ImageView) findViewById(R.id.ee93name);
        ImageView iv8 = (ImageView) findViewById(R.id.facebookee93);
        ImageView iv9 = (ImageView) findViewById(R.id.twitteree93);
        ImageView iv10 = (ImageView) findViewById(R.id.wikiaee93);
        ImageView iv11 = (ImageView) findViewById(R.id.googleplusee93);
        ImageView iv12 = (ImageView) findViewById(R.id.pe619_name);
        ImageView iv13 = (ImageView) findViewById(R.id.twitterpe619);
        ImageView iv14 = (ImageView) findViewById(R.id.bloggerpe619);
        ImageView iv15 = (ImageView) findViewById(R.id.dailype619);
        ImageView iv16 = (ImageView) findViewById(R.id.googlepluspe619);
        ImageView iv17 = (ImageView) findViewById(R.id.skj_name);
        ImageView iv18 = (ImageView) findViewById(R.id.facebookskj);
        ImageView iv19 = (ImageView) findViewById(R.id.twitterskj);
        ImageView iv20 = (ImageView) findViewById(R.id.bloggerskj);
        ImageView iv21 = (ImageView) findViewById(R.id.googleplusskj);

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
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/google_plus_zpszfueyvi2.png").fit().centerCrop().into(iv6);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/enterprisingengine_font_zpsmgntdqpl.png").into(iv7);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/facebook_logo_zpshw1bp6mq.png").fit().centerCrop().into(iv8);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/twitter_logo_zpswqppmpdv.png").fit().centerCrop().into(iv9);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/wikia_logo_zpsojh852am.png").fit().centerCrop().into(iv10);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/google_plus_zpszfueyvi2.png").fit().centerCrop().into(iv11);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/pe619_font_zpsyqnmzxwe.png").into(iv12);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/twitter_logo_zpswqppmpdv.png").fit().centerCrop().into(iv13);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/bloggerlogo_zpslzxe0r2j.png").fit().centerCrop().into(iv14);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/dailymotion_logo_zpsljevtfdf.png").fit().centerCrop().into(iv15);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/google_plus_zpszfueyvi2.png").fit().centerCrop().into(iv16);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/skj_font_zps0wpjsx2p.png").into(iv17);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/facebook_logo_zpshw1bp6mq.png").fit().centerCrop().into(iv18);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/twitter_logo_zpswqppmpdv.png").fit().centerCrop().into(iv19);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/bloggerlogo_zpslzxe0r2j.png").fit().centerCrop().into(iv20);
        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/google_plus_zpszfueyvi2.png").fit().centerCrop().into(iv21);

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