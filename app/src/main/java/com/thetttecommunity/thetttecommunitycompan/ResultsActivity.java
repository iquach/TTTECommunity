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
            case 1: t.setText("You have disappointed the Sir Topham Hatt!");
                break;
            case 2: t.setText("Bust My Buffers! Better Luck Next Time");
                break;
            case 3:
            case 4:
            case 5: t.setText("You have seem to been in accident. Try the quiz again :(");
                break;
            case 6: t.setText("Not bad at least you are clean - The Diesel in Bowled Out");
                break;
            case 7: t.setText("Don't give up, show determination!");
                break;
            case 8: t.setText("All you need is some determination - Percy in Percy takes a plunge");
                break;
            case 9: t.setText("You seem to be stuck on Gordon's Hill.");
                break;
            case 10:
            case 11: t.setText("Pretty Good Mighty YouTuber! Thomas is Proud!");
                break;
            case 12:
            case 13: t.setText("Potential Admin Material! You know your history!");
                break;
            case 14:t.setText("Admin Material! A new coat a paint for you!");
                break;
            case 15:t.setText("Are you the Founder? 100%!!!");
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }
}
