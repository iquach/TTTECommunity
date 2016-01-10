package com.thetttecommunity.thetttecommunitycompan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

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
        //get score

        Bundle b = getIntent().getExtras();
        int score= b.getInt("score");
        //display score
        user_score.setText(score + "/15");
        switch (score)
        {
            case 0: t.setText("Yikes!!!");
                break;
            case 1: t.setText("Bust My Buffers! Better Luck Next Time");
                break;
            case 2: t.setText("You have grey wheels! Try again");
                break;
            case 3: t.setText("Poor Henry!");
                break;
            case 4: t.setText("O the Indignity!");
                break;
            case 5: t.setText("You are cause confusion and delays with these wrong answers!");
                break;
            case 6: t.setText("All you need is some determination then maybe you will get more" +
                    "points.");
                break;
            case 7: t.setText("Don't give up, show determination!");
                break;
            case 8: t.setText("There are two things of doing things, the great western way " +
                    "or the wrong way. Choose the GWW");
                break;
            case 9: t.setText("You seem to be stuck on Gordon's Hill. You can do better.");
                break;
            case 10: t.setText("At least you are over Gordon's Hill. Good Work.");
                break;
            case 11: t.setText("Well Done YouTuber, Well Done!");
                break;
            case 12: t.setText("The Fat Controller is Proud! He may give a branch line.");
                break;
            case 13: t.setText("A new coat a paint for you!");
                break;
            case 14:t.setText("The Fat Controller is giving you special coaches!");
                break;
            case 15:t.setText("You are a really useful engine! 100%!!! A Find Piece of Work!");
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
