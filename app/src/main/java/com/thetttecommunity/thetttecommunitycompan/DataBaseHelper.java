package com.thetttecommunity.thetttecommunitycompan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
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

        quesList.add(new Questions( "What was the one thing the Community did in order to keep the TAB project consistent?", "To use red James' instead of black ones", "To make Thomas the color green", "Make Gordon the color yellow and black", "Make Sidekickjason voice all the characters"));
        quesList.add(new Questions( "Who is the former admin of the TTTE community?", "Ucwepn", "Wong Village", "Goku", "Gordon the Big Engine"));
        quesList.add(new Questions( "What was the first mini-remake uploaded to Youtube?", "Ghost Train/Percy's Ghostly Trick", "Thomas Gets Tricked/Thomas And Gordon", "Gordon Takes a Tumble", "Edward and The Mail"));
        quesList.add(new Questions( "Which two episodes were chosen for the second community project?", "Down The Mine and Off The Rails/Gordon Takes A Dip", "Percy’s Promise/Percy and The Signal", "The Special Letter/Gordon Goes Foreign", "The World's Strongest Engine/Henry’s Greatest Achievement"));
        quesList.add(new Questions( "What was the first remake submitted to the channel?", "Thomas And Gordon/Thomas Gets Tricked", "Down The Mine", "Thomas and The Stinky Cheese", "Gordon Goes Hollywood"));
        quesList.add(new Questions( "What was the first community remake to not have Thomas as one of the characters?", "Pop Goes The Diesel", "Gordon Goes Bollywood", "Edward’s Exploit", "Percy’s Ghostly Trick"));
        quesList.add(new Questions( "What year did Welcome to the Thomas the Tank Engine Community Channel! video come out?", "2013", "2012", "2009", "2014"));
        quesList.add(new Questions( "Who are the admins?", "DieselD199, Enterprisingengine93, Percyengine619, and Sidekickjason", "Goku, Vegeta, Piccolo, and Trunks", "Thomas, Percy, James, and Toby", "Diesel, Diesel 10, Arry, and bert"));
        quesList.add(new Questions( "What was song used in the first TTTE music video?", "Thriller", "The Island Song", "Thomas’ Anthem", "Night Train"));
        quesList.add(new Questions( "How many admins are there in the TTTE Community?", "4", "3", "5", "Over 9000"));
        quesList.add(new Questions( "What was Enterprisingengine93 first remake as director?", "Pop Goes The Diesel", "Down The Mine", "Thomas and Gordon/Thomas Gets Tricked", "Gordon Goes Super Saiyan"));
        quesList.add(new Questions( "What is the TTTE Community website name?", "www.thetttecommunity.com", "www.tttecommunity.com", "www.gordongoesgreen.com", "www.thomasandfriends.com"));
        quesList.add(new Questions( "what is our official twitter name?", "@tttecommunity", "@thetttecommunity", "@gordondoesntgoforeign", "@toomanygordongoesforeignreference "));
        quesList.add(new Questions( "Who is the only admin to use Wooden trains?", "Enterprisingengine93", "DieselD199", "Percyengine619", "Sidekickjason"));
        quesList.add(new Questions( "The TTTE Community channel has all of the following social media except:", "Snapchat", "Facebook", "Twitter", "YouTube"));
        quesList.add(new Questions( "What is the first community movie remake?", "The Adventure Begins", "Calling All Engines", "Hero of the Rails", "Gordon The Movie"));

        return quesList;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        onCreate(db);
    }
}
