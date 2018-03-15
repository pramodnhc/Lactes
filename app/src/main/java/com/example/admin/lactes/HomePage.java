package com.example.admin.lactes;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private DrawerLayout mdrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mtoolbar;
    private CardView milktouch;
    private CardView curdtouch;
    private CardView watertouch;
    private CardView supporttouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        milktouch = (CardView) findViewById(R.id.homemilkbutton);
        curdtouch = (CardView) findViewById(R.id.homecurdbutton);
        watertouch = (CardView) findViewById(R.id.homewaterbutton);
        supporttouch = (CardView) findViewById(R.id.homesupportbutton);
        setSupportActionBar(mtoolbar);
        mdrawerLayout=(DrawerLayout)findViewById(R.id.drawerlayout);
        mToggle=new ActionBarDrawerToggle(this,mdrawerLayout,R.string.open,R.string.close);
        mdrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        milktouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activitychange = new Intent(HomePage.this,MainActivity.class);
                HomePage.this.startActivity(activitychange);
            }

        });
        curdtouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activitychange = new Intent(HomePage.this,MainActivity.class);
                HomePage.this.startActivity(activitychange);
            }

        });
        watertouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activitychange = new Intent(HomePage.this,MainActivity.class);
                HomePage.this.startActivity(activitychange);
            }

        });
        supporttouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activitychange = new Intent(HomePage.this,MainActivity.class);
                HomePage.this.startActivity(activitychange);
            }

        });



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
