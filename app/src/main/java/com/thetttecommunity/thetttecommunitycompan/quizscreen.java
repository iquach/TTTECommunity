package com.thetttecommunity.thetttecommunitycompan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class quizscreen extends Activity {

    // TextView final_result;
    RadioButton button1, button2, button3, button4;

    List<Questions> listofQuestions;
    int score = 0;
    int questionID = 0;
    Questions curr;
    TextView questionText;
    Button gotoNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizscreen);
/*        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);*/
        //setSupportActionBar(toolbar);

        DataBaseHelper dbHepler = new DataBaseHelper(this);
        ;
        listofQuestions = dbHepler.getAllQuestions();
        curr = listofQuestions.get(questionID);
        questionText = (TextView) findViewById(R.id.textView);

        button1 = (RadioButton)findViewById(R.id.radioButton);
        button2 = (RadioButton)findViewById(R.id.radioButton2);
        button3 = (RadioButton)findViewById(R.id.radioButton3);
        button4 = (RadioButton)findViewById(R.id.radioButton4);

        gotoNext = (Button)findViewById(R.id.next_button);
        setQuestionView();
        gotoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup grp = (RadioGroup) findViewById(R.id.radioBro);
                RadioButton answer = (RadioButton) findViewById(grp.getCheckedRadioButtonId());
                Log.d("your ans", curr.getCorrectanswer() + " " + answer.getText());
                if (curr.getCorrectanswer().equals(answer.getText())) {
                    score++;
                    Log.d("score", "Your score" + score);
                }
                if(questionID<10){
                    curr = listofQuestions.get(questionID);
                    setQuestionView();
                }else{
                    Intent intent = new Intent(quizscreen.this, ResultsActivity.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); //Your score
                    intent.putExtras(b); //Put your score to your next Intent
                    startActivity(intent);
                    finish();
                }


            }
        });
        //final_result = (TextView)findViewById(R.id.result);

        /*Hides TextView*/

        //final_result.setEnabled(false);

   /*     FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }



 /*   private void setQuizText () {
        if ( listofQuestions.size() > 0 ) {
            button1.setText("CHOICE1");
        } else {
            button1.setText("NOTHIN");
        }

    }*/

    /*public void chooseAnswer(View view)
    {

        boolean check = ((RadioButton) view).isChecked();

        *//*Print specific messages for each case*//*

        if (check) {

            switch (view.getId()) {

                case R.id.radioButton:
                    final_result.setText("You chose CHOICE1");
                    final_result.setEnabled(true);
                    break;

                case R.id.radioButton2:
                    final_result.setText("You chose CHOICE2");
                    final_result.setEnabled(true);
                    break;

                case R.id.radioButton3:
                    final_result.setText("You chose CHOICE3");
                    final_result.setEnabled(true);
                    break;

                case R.id.radioButton4:
                    final_result.setText("You chose CHOICE4");
                    final_result.setEnabled(true);
                    break;
            }

        } else {

            final_result.setEnabled(false);

        }

    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
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

    private void setQuestionView() {

        questionText.setText(curr.askQuestion());

        ArrayList<String> arr = new ArrayList<>();

        arr.add(curr.getCorrectanswer());
        arr.add(curr.getFalseanswer1());
        arr.add(curr.getFalseanswer2());
        arr.add(curr.getFalseanswer3());

        Collections.shuffle(arr);

        button1.setText(arr.get(0));
        button2.setText(arr.get(1));
        button3.setText(arr.get(2));
        button4.setText(arr.get(3));
        questionID++;

        arr.clear();


    }

}
