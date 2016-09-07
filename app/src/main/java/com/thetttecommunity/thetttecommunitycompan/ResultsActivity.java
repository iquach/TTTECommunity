package com.thetttecommunity.thetttecommunitycompan;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ResultsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        //Continue button that goes to the results page.

        Button goToResults = (Button) findViewById(R.id.continue_Button);
        goToResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultsActivity.this, QuizCredits.class);
                startActivity(intent);
                finish();
            }
        });

        //get rating bar object
        TextView user_score = (TextView) findViewById(R.id.score_user);
        //get text view
        TextView t=(TextView)findViewById(R.id.textResult);
        ImageView iv1 = (ImageView)findViewById(R.id.prize);
        //get score

        Bundle b = getIntent().getExtras();
        int score= b.getInt("score");
        //display score
        user_score.setText(score + "/15");
        switch (score)
        {
            case 0: t.setText("Yikes!!!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                        "patsviper46/GordonTakesaTumble9_zps0dj4awqr.png").fit().
                        centerCrop().into(iv1);
                break;
            case 1: t.setText("Bust My Buffers! Better Luck Next Time");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                        "patsviper46/BufferBother56_zpsjr1gix9h.jpg").fit().
                        centerCrop().into(iv1);
                break;
            case 2: t.setText("Cinder and Ashes! Try again!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                        "patsviper46/ThomasAndTheSpecialLetter37_" +
                        "zpshzypneub.png").fit().centerCrop().into(iv1);
                break;
            case 3: t.setText("Poor Henry!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                        "patsviper46/TheFlyingKipper36_zps9mad" +
                        "g1tl.png").fit().centerCrop().into(iv1);
                break;
            case 4: t.setText("O the Indignity!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                        "patsviper46/OfftheRails25_zpsh26go8r1.png").fit().centerCrop().into(iv1);
                break;
            case 5: t.setText("You are causing confusion and delay with these wrong answers!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                        "patsviper46/DuckTakesCharge52_zps2icqg3x" +
                        "w.png").fit().centerCrop().into(iv1);
                break;
            case 6: t.setText("All you need is some determination....");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/a443/" +
                        "patsviper46/PercyTakesthePlunge24_z" +
                        "ps1gg9jxcd.png").fit().centerCrop().into(iv1);
                break;
            case 7: t.setText("Flat My Funnel!");
                Picasso.with(this).load("http://i1036.photobucket.com/albums/" +
                        "a443/patsviper46/SpecialFunnel" +
                        "2_zpsu72xstpj.png").fit().centerCrop().into(iv1);
                break;
            case 8: t.setText("There are two ways of doing things, the great western way " +
                    "or the wrong way. Choose Great Western");
                Picasso.with(this).load("http://i1036.photobucket.com" +
                        "/albums/a443/patsviper46/DuckTakesCha" +
                        "rge35_zpshopm0rhh.png").fit().centerCrop().into(iv1);
                break;
            case 9: t.setText("You seem to be stuck on Gordon's Hill. You can do better.");
                Picasso.with(this).load("http://i1036.photobucket.c" +
                        "om/albums/a443/patsviper46/EdwardandGor" +
                        "don8_zpsw2tckw9h.png").fit().centerCrop().into(iv1);
                break;
            case 10: t.setText("At least you are over Gordon's Hill. Good Work.");
                Picasso.with(this).load("http://i1036.photobucket.com/" +
                        "albums/a443/patsviper46/TheTrou" +
                        "blewithMud76_zpsaqu324c1.png").fit().centerCrop().into(iv1);
                break;
            case 11: t.setText("WELL DONE TANKIE, WELL DONE!");
                Picasso.with(this).load("http://i1036.photobucket." +
                        "com/albums/a443/patsviper46/ThomasAndTh" +
                        "eMagicRailroad968_zpsak5podbb.png").fit().centerCrop().into(iv1);
                break;
            case 12: t.setText("The Fat Controller is Proud! He may give you a branch line.");
                Picasso.with(this).load("http://i1036.photobucket.com/" +
                        "albums/a443/patsviper46/ThomasPercyan" +
                        "dtheDragon7_zpsxp95qatx.png").fit().centerCrop().into(iv1);
                break;
            case 13: t.setText("Your reward is a new coat a paint!");
                Picasso.with(this).load("http://i1036.photobucket.com/" +
                        "albums/a443/patsviper46/JamesGetsaNew" +
                        "Coat30_zpsounfloce.png").fit().centerCrop().into(iv1);
                break;
            case 14:t.setText("The Fat Controller is giving you special coaches!");
                Picasso.with(this).load("http://i1036.photobucket.com/" +
                        "albums/a443/patsviper46/Thomasand" +
                        "theBreakdownTrain46_zpscbods6cb.png").fit().centerCrop().into(iv1);
                break;
            case 15:t.setText("You are a really useful engine!");
                Picasso.with(this).load("http://i1036.photobucket.com/" +
                        "albums/a443/patsviper46/ThomasandGordon6" +
                        "3_zpsprzgfoqj.png").fit().centerCrop().into(iv1);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
    }
}
