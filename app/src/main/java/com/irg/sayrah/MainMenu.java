package com.irg.sayrah;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.Calendar;

public class MainMenu extends AppCompatActivity {

    RelativeLayout ChatSarahBTN;
    RelativeLayout EmergencyBTN;
    RelativeLayout WebBTN;
    RelativeLayout WhoBTN;
    RelativeLayout DonateBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        CreateNotificationChannel();

        ChatSarahBTN = findViewById(R.id.cs_btn);
        EmergencyBTN = findViewById(R.id.emergency_btn);
        WebBTN = findViewById(R.id.web_btn);
        WhoBTN =  findViewById(R.id.who_btn);
        DonateBTN = findViewById(R.id.donatebtn);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainMenu.this, ReminderBroadcast.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(MainMenu.this, 0, intent, 0);
                AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);

                Calendar calendar = Calendar.getInstance();

                calendar.set(Calendar.HOUR_OF_DAY, 8);
                calendar.set(Calendar.MINUTE, 0);
                calendar.set(Calendar.SECOND, 0);

                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_HALF_DAY, pendingIntent);

               /* long timeBTNClick = System.currentTimeMillis();
                long tenSMillis = 1000*10;
                alarmManager.set(AlarmManager.RTC_WAKEUP, timeBTNClick + tenSMillis, pendingIntent);*/


            }
        },3000);


        WebBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapView = new Intent(MainMenu.this, MapUpdates.class);
                startActivity(mapView);
            }
        });

        WhoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent who = new Intent(MainMenu.this, Who.class);
                startActivity(who);

            }
        });

        DonateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent donate = new Intent(MainMenu.this, Donate.class);
                startActivity(donate);
            }
        });

        ChatSarahBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(MainMenu.this)
                        .setTitle("Privacy")
                        .setMessage("None of the data in this chat is stored at all, in fact you would have to start all over if you exit the chat")

                        // Specifying a listener allows you to take an action before dismissing the dialog.
                        // The dialog is automatically dismissed when a dialog button is clicked.
                        .setPositiveButton("CONTINUE", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continue with delete operation
                                Intent CS = new Intent(MainMenu.this, MainActivity.class);
                                startActivity(CS);

                            }
                        })

                        // A null listener allows the button to dismiss the dialog and take no further action.
                        .setNegativeButton("BACK", null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();



            }
        });

        EmergencyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EC = new Intent(MainMenu.this, Emergency.class);
                startActivity(EC);
            }
        });

    }

    private void CreateNotificationChannel(){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            CharSequence name = "ReminderChannel";
            String description = "Channel for Reminder";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("notify", name, importance);
            channel.setDescription(description);


            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);


        }
    }

    @Override
    public void onBackPressed() {
        finish();
        //super.onBackPressed();
    }
}
