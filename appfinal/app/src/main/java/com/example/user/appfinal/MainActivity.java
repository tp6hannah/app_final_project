package com.example.user.appfinal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    private ImageButton mSchool;
    private ImageButton mHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSchool = (ImageButton) findViewById(R.id.btschool);
        mHome = (ImageButton) findViewById(R.id.bthome);
        mSchool.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = MainActivity.this;
                Class destinationActivity = ChildActivity.class;
                Intent startChildActivityIntent = new Intent(context, destinationActivity);
                startActivity(startChildActivityIntent);
            }
        });
    }



}
