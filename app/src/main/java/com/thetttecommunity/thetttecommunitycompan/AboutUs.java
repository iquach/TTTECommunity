package com.thetttecommunity.thetttecommunitycompan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//
        /*ImageView iv1 = (ImageView) findViewById(R.id.diesel_logo);*/
        ImageView iv2 = (ImageView) findViewById(R.id.e393_logo);
        ImageView iv3 = (ImageView) findViewById(R.id.pe619_logo);
        ImageView iv4 = (ImageView) findViewById(R.id.skj_logo);
        /*Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/dieseld199_logo_lite_zpsa" +
                "zgcgbfk.png").fit().centerCrop().into(iv1);*/

        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/logoee2_zpscdfhc25r.png").fit().centerCrop().into(iv2);

        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/icon_pe619_zpsmdyekn3o.png").fit().centerCrop().into(iv3);

        Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                "patsviper46/skj_logo_icon_zpsi2yzdg1c.png").fit().centerCrop().into(iv4);
    }




    public void goToDiesel(View view) {
        goToUrl("https://www.youtube.com/user/DieselD199");
    }

    public void goToEnterprising(View view) {
        goToUrl("https://www.youtube.com/user/Enterprisingengine93");
    }

    public void goToPengine(View view) {
        goToUrl("https://www.youtube.com/user/Percyengine619");
    }

    public void goToSideKick(View view) {
        goToUrl("https://www.youtube.com/user/Sidekickjason");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
