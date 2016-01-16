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
                Picasso.with(this).load("http://vignette4.wikia.nocookie.net/ttte/images/f/fd/" +
                        "GordonTakesaTumble9.png/revision/latest?cb=20151113222820").fit().
                        centerCrop().into(iv1);
                break;
            case 1: t.setText("Bust My Buffers! Better Luck Next Time");
                Picasso.with(this).load("http://vignette3.wikia.nocookie.net/ttte/images/6/69/" +
                        "BufferBother56.JPG/revision/latest?cb=20151116224721").fit().
                        centerCrop().into(iv1);
                break;
            case 2: t.setText("Cinder and Ashes! Try again!");
                Picasso.with(this).load("http://vignette4.wikia.nocookie.net/ttte/images/b/b5/" +
                        "ThomasAndTheSpecialLetter37.png/revision/latest?cb=2" +
                        "0150309184634").fit().centerCrop().into(iv1);
                break;
            case 3: t.setText("Poor Henry!");
                Picasso.with(this).load("http://vignette1.wikia.nocookie.net/ttte/images/0/05/Th" +
                        "eFlyingKipper36.png/revision/latest" +
                        "?cb=20160108174555").fit().centerCrop().into(iv1);
                break;
            case 4: t.setText("O the Indignity!");
                Picasso.with(this).load("http://vignette1.wikia.nocookie.net/ttte/image" +
                        "s/e/ed/OfftheRails25.png/revision/la" +
                        "test?cb=20131127173911").fit().centerCrop().into(iv1);
                break;
            case 5: t.setText("You are causing confusion and delay with these wrong answers!");
                Picasso.with(this).load("http://vignette3.wikia.nocookie.net/ttte/images/" +
                        "c/cc/DuckTakesCharge52.png/revision/latest" +
                        "?cb=20130219141552").fit().centerCrop().into(iv1);
                break;
            case 6: t.setText("All you need is some determination....");
                Picasso.with(this).load("http://vignette3.wikia.nocookie" +
                        ".net/ttte/images/b/be/DuckTakesCharge31" +
                        ".png/revision/latest?cb=20130218225736").fit().centerCrop().into(iv1);
                break;
            case 7: t.setText("Flat My Funnel!");
                Picasso.with(this).load("http://vignette1.wikia.nocookie.net/ttt" +
                        "e/images/c/cf/SpecialFunnel2.png/revision/lates" +
                        "t?cb=20140620201003").fit().centerCrop().into(iv1);
                break;
            case 8: t.setText("There are two ways of doing things, the great western way " +
                    "or the wrong way. Choose Great Western");
                Picasso.with(this).load("http://vignette2.wikia.nocookie.net/ttte/" +
                        "images/d/df/DuckTakesCharge35.png/revision/latest" +
                        "?cb=20130218225955").fit().centerCrop().into(iv1);
                break;
            case 9: t.setText("You seem to be stuck on Gordon's Hill. You can do better.");
                Picasso.with(this).load("http://vignette1.wikia.nocookie.net/ttte/" +
                        "images/3/3a/EdwardandGordon8.png/revision/latest?cb=2" +
                        "0121017225204").fit().centerCrop().into(iv1);
                break;
            case 10: t.setText("At least you are over Gordon's Hill. Good Work.");
                Picasso.with(this).load("http://vignette2.wikia.nocookie.net/ttte/images/e/e7/" +
                        "TheTroublewithMud76.png/revisi" +
                        "on/latest?cb=20140407084653").fit().centerCrop().into(iv1);
                break;
            case 11: t.setText("WELL DONE TANKIE, WELL DONE!");
                Picasso.with(this).load("http://vignette4.wikia.nocookie.net/" +
                        "ttte/images/f/f5/ThomasAndTheMagicRailroad968." +
                        "png/revision/latest?cb=20150728162529").fit().centerCrop().into(iv1);
                break;
            case 12: t.setText("The Fat Controller is Proud! He may give you a branch line.");
                Picasso.with(this).load("http://vignette3.wikia.nocookie.net/ttte/" +
                        "images/a/a5/Thomas%2CPercyandtheDragon7.PNG/" +
                        "revision/latest?cb=20130521124746").fit().centerCrop().into(iv1);
                break;
            case 13: t.setText("Your reward is a new coat a paint!");
                Picasso.with(this).load("http://vignette3.wikia.nocookie.net/ttte/" +
                        "images/e/e9/EdwardandGordon44.png/" +
                        "revision/latest?cb=20121017232553").fit().centerCrop().into(iv1);
                break;
            case 14:t.setText("The Fat Controller is giving you special coaches!");
                Picasso.with(this).load("http://vignette2.wikia.nocookie.net/" +
                        "ttte/images/f/f0/ThomasandtheBreakdownTrain46." +
                        "png/revision/latest?cb=20131117163450").fit().centerCrop().into(iv1);
                break;
            case 15:t.setText("You are a really useful engine!");
                Picasso.with(this).load("http://vignette3.wikia.nocookie.net/" +
                        "ttte/images/5/50/ThomasandGordon63.png/revision/" +
                        "latest?cb=20121017173537").fit().centerCrop().into(iv1);
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
