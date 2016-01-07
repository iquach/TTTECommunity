package com.thetttecommunity.thetttecommunitycompan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The purpose of this class is to create a Database Helper that will contain
 * the TTTECommunityQuiz app's question data.
 *
 * Created by Michael Abercrombie on 12/29/2015.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    /* This ListofQuestions contains each of the quiz questions and their respective
    *  answer choices
    */

    //private static ListofQuestions temp;

    /* Name of DataBaseHelper */

    private static final String NAME = "TTTE_QUIZ";

    /* Version Number of Database Helper */

    private static final int VERSION = 1;

    /* Constructor for Database Helper */

    // tasks table name
    private static final String TABLE_QUEST = "quest";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private static final String KEY_OPTD = "optd"; //option d
    private SQLiteDatabase dbase;

    public DataBaseHelper(Context c) {
        super(c, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        dbase = db;

        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT, " + KEY_OPTD + " TEXT)";

        db.execSQL(sql);

    }


    public List<Questions> getAllQuestions() {
        List<Questions> quesList = new ArrayList<>();

        quesList.add(new Questions("Who is Percyengine619 favorite character? ",
                "Percy", "Edward", "Diesel 10", "Oliver"));
        quesList.add(new Questions("What colors is the sky for the layout?",
                "Light Blue", "Dark Blue", "Yellow", "White"));

        quesList.add(new Questions("Which season has Percyengine619 completed?", "Season 1", "Season 3", "Season 11", "Season 5"));
        //insertQuestion(t2);
        quesList.add(new Questions("What was Percyengine619 first movie remake?", "Thomas & The Magic Railroad", "Hero of The Rails", "Star Wars: The Force Awakens", "The Adventure Begins"));
        //insertQuestion(t3);
        quesList.add(new Questions("What was Percyengine619 first remake?", "Percy, James, & The Fruitful Day", "Thomas and Gordon", "Percy’s Ghostly Trick", "Thomas & The Carnival "));
        //insertQuestion(t4);
        quesList.add(new Questions("What remake was the collaboration of DieselD199 and Percyengine619?", "Edward Strikes Out", "Edward & The Mail", "Edward’s Exploit", "Edward and Gordon"));
        //insertQuestion(t5));
        quesList.add(new Questions("What year was Tomy Thomas & The Magic Railroad was released?", "2012", "2010", "2008", "2015"));
        //insertQuestion(t6));
        quesList.add(new Questions("How many version of Tomy James in a Mess are there?", "3", "2", "1", "4"));
        //insertQuestion(t7));
        quesList.add(new Questions("How many remakes have there been with snow on the layout?", "6", "3", "10", "2"));
        //insertQuestion(t8));
        quesList.add(new Questions("Who is Percyengine619 favorite narrator?", "George Carlin", "Ringo Starr", "Alec Baldwin", "Michael Angelis "));
        //insertQuestion(t9));
        quesList.add(new Questions("What was the first Sodor Race match?", "Thomas vs Percy", "Gordon vs Spencer", "Ben vs Douglas", "Oliver vs Henry"));
        //insertQuestion(t10));
        quesList.add(new Questions("When did Angry Gordon make his debut in Percyengine619 remakes?", "Tomy TAB: Thomas & Gordon", "Tomy The Trouble With The Mud", "Tomy Old Reliable Edward", "Tomy Gordon & Spencer"));
        //insertQuestion(t11));
        quesList.add(new Questions("What is my most-viewed video?", "Tomy Best of Gordon DVD", "Tomy Thomas & The Magic Railroad Chase Scene", "Tomy Hero of The Rails Full Movie", "Greatest Tomy Percy Accident "));
        //insertQuestion(t12));
        quesList.add(new Questions("What video did WoollyBearNO6Films themes make an appearance in?", "Tomy Thomas and Friends Henry's Accident Short", "Tomy Sodor Races: Thomas vs Percy ", "Greatest Tomy Thomas Accident", "Tomy Sodor Races: Gordon vs Henry"));
        //insertQuestion(t13));
        quesList.add(new Questions("Who was the ghost engine from Tomy Duncan gets Spooked?", "Peter Sam", "Skarloey", "Sir Handel", "Duncan"));
        //insertQuestion(t14));
        quesList.add(new Questions("When did Tomy Hero of The Rails come out?", "July 2014", "June 2014", "July 2015", "August 1986"));
        //insertQuestion(t15));
        quesList.add(new Questions("Who was the main influence to my channel?", "jjschepis3", "skullzproductions", "leokimvideo", "trainlover476"));
        //insertQuestion(t16));
        quesList.add(new Questions("What is the bonus remake at the end of the Tomy Complete Collection Season 1?", "Tomy Thomas & Stepney", "Tomy Edward Strikes Out", "Tomy Better Late Than Never", "Tomy Rusty to The Rescue"));
        //insertQuestion(t17));
        quesList.add(new Questions("What is the longest running joke of the Tomy remakes?", "Sir Topham Hatt being bigger than all the humans.", "The tracks being blue rather than silver.", "The drivers being the same four drivers for all the engines.", "Bertie being bus"));
        //insertQuestion(t18));
        quesList.add(new Questions("What was the last remake of “The Dark Blue Walls Era”?", "Tomy Gordon & Spencer", "Tomy The Trouble With The Mud", "Tomy Educate Gordon Day", "Tomy Old Iron"));
        //insertQuestion(t19));
        quesList.add(new Questions("Who was the ghost train in Tomy Percy’s Ghostly Trick?", "Percy", "Thomas", "Stepney", "Oliver"));
        //insertQuestion(t20));
        quesList.add(new Questions("Why did I chose UK Dub instead of US dub for Tomy Thomas & The Birthday Mail?", "ITS MEEEEEEEEEE!!", "US Dub wasn’t available", "DieselD199 requested for UK dub", "Editing Accident"));
        //insertQuestion(t21));
        quesList.add(new Questions("Percyengine619 owns a rare Horrid Lorry", "True", "False", "Silly Engine!", "Pick me!"));
        //insertQuestion(t22));
        quesList.add(new Questions("What was the only remake done outside in the snow?", "Tomy Snow Engine", "Tomy Thomas Christmas Party", "Tomy Terence the Tractor", "Tomy Deputation"));
        //insertQuestion(t23));
        quesList.add(new Questions("Tomy Bye George features an ____ George", "Ertl", "Tomy", "Wooden", "HO-Scale"));
        // insertQuestion(t24));
        quesList.add(new Questions("Who is Percyengine619 second favorite character?", "Diesel 10", "Edward", "Henry", "Duck"));
        // insertQuestion(t25));
        quesList.add(new Questions("What is the rarest Tomy item I own?", "Tomy Old Slow Coach", "Tomy Gordon", "Tomy Angry Face Thomas", "Tomy Oliver"));
        // insertQuestion(t26));
        quesList.add(new Questions("How many express coaches do I own?", "Too many to count", "2", "0", "1"));
        //insertQuestion(t27));
        quesList.add(new Questions("What color is was Spencer in Tomy Gordon and Spencer (2015)?", "Silver", "Golden", "Bronze", "Gray"));
        //insertQuestion(t28));
        quesList.add(new Questions("Are there any Ho-scale animals on the layout?", "Yes", "No", "Maybe", "I Don’t Know"));
        //insertQuestion(t29));
        quesList.add(new Questions("What did I use for the wall in Tomy Come Out, Henry!?", "Sticks of gum", "Newspaper and a pair of bootlaces", "Sir Topham Hatt Trousers", "Legoes"));
        // insertQuestion(t30);

        Collections.shuffle(quesList);

        return quesList;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        onCreate(db);
    }
}
