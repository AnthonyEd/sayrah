package com.irg.sayrah;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        SharedPreferences sp = getSharedPreferences("gate", Activity.MODE_PRIVATE);
        int myIntValue = sp.getInt("gate", -1);

        if(myIntValue < 2){

            Intent WelcomeI = new Intent(Launcher.this, Welcome.class);
            startActivity(WelcomeI);
            finish();

        }

        else {

            Intent Main = new Intent(Launcher.this, MainMenu.class);
            startActivity(Main);
            finish();

        }


    }
}
