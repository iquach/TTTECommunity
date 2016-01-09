package com.thetttecommunity.thetttecommunitycompan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button social = (Button) findViewById(R.id.social_Media);
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, SocialMedaPage.class);
                startActivity(intent);
            }
        });

        //Goes to about us page when clicked.

        Button aboutUs = (Button) findViewById(R.id.about_us);
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, AboutUs.class);
                startActivity(intent);
            }
        });

        //Goes to loadingscreenofquiz when clicked.

        Button loadingScreen = (Button) findViewById(R.id.quiz_button);
        loadingScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, loadingscreenofquiz.class);
                startActivity(intent);
            }
        });

        Button contactUs = (Button) findViewById(R.id.contact_button);
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, contactus_page.class);
                startActivity(intent);
            }
        });

        Button tutorailsbutton = (Button) findViewById(R.id.tutorials_page_link);
        tutorailsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepage.this, tutorials.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }

    // Methods that direct the user to the website.

   public void goToYoutube (View view) {
       goToUrl("https://www.youtube.com/user/thetttecommunity/featured");
    }

    public void goToTwitter(View view) {
        goToUrl("https://twitter.com/tttecommunity");
    }

    public void goToFacebook(View view) {
        goToUrl("https://facebook.com/thetttecommunity");
    }

    public void goToPastP(View view) {
        goToUrl("https://www.youtube.com/playlist?list=PL2oQR5EQqTgGr6qTtMXLKBqbTEd6PK3vV");
    }

    public void goToWaitList(View view) {
        goToUrl("https://tttecommunity.wufoo.com/forms/z153ewir184yych");
    }

    public void goToWiki(View view) {
        goToUrl("http://the-ttte-community.wikia.com/wiki/The_TTTE_Community_Wiki");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
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

}
