package com.irg.sayrah;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    Button AgreeContinue;
    Button TP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        AgreeContinue = findViewById(R.id.agreeContinue);
        TP = findViewById(R.id.tp);

        AgreeContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                new AlertDialog.Builder(Welcome.this)
                        .setTitle("Notifications")
                        .setMessage("If you continue I would also keep sending you consistent notifications and reminders for you to practice self hygiene so you can stay safe. Also remember to wash your hands thoroughly for at least 20 seconds!")

                        // Specifying a listener allows you to take an action before dismissing the dialog.
                        // The dialog is automatically dismissed when a dialog button is clicked.
                        .setPositiveButton("CONTINUE", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continue with delete operation

                                SharedPreferences sp = getSharedPreferences("gate", Activity.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sp.edit();
                                editor.putInt("gate", 100);
                                editor.commit();

                                Intent main = new Intent(Welcome.this, MainMenu.class);
                                startActivity(main);
                                finish();


                            }
                        })

                        // A null listener allows the button to dismiss the dialog and take no further action.
                        .setNegativeButton("BACK", null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();




            }
        });


        TP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent maintp = new Intent(Welcome.this, TuPp.class);
                startActivity(maintp);

            }
        });


    }
}
