package com.irg.sayrah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView typing;
    TextView getName;
    TextView getYear;
    Button WTBTN;
    Button BTN;
    TextView EndText;
    EditText Name;
    ImageView SName;
    ImageView SYear;
    Spinner spinner;
    RelativeLayout Pack1;
    RelativeLayout Pack2;
    RelativeLayout Pack3;
    RelativeLayout Pack4;
    RelativeLayout Pack5;
    RelativeLayout Pack6;
    RelativeLayout Pack7;
    RelativeLayout Pack8;
    RelativeLayout Pack9;
    RelativeLayout Pack10;
    RelativeLayout Pack11;
    RelativeLayout Pack12;
    RelativeLayout Pack13;
    RelativeLayout Pack14;
    RelativeLayout Pack15;
    RelativeLayout Pack16;
    RelativeLayout Pack17;
    RelativeLayout Pack18;
    RelativeLayout Pack121;
    RelativeLayout Pack19;
    RelativeLayout Pack20;


    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;



    int year;
    int count;

    int save1;

    private Application saveState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //saveState = getApplication();

        Toolbar toolbar = findViewById(R.id.toolbar);

        typing = findViewById(R.id.typing);
        Pack1 = findViewById(R.id.pack1);
        Pack2 = findViewById(R.id.pack2);
        Pack3 = findViewById(R.id.pack3);
        Pack4 = findViewById(R.id.pack4);
        Pack5 = findViewById(R.id.pack5);
        Pack6 = findViewById(R.id.pack6);
        Pack7 = findViewById(R.id.pack7);
        Pack8 = findViewById(R.id.pack8);
        Pack9 = findViewById(R.id.pack9);
        Pack10 = findViewById(R.id.pack10);
        Pack11 = findViewById(R.id.pack11);
        Pack12 = findViewById(R.id.pack12);
        Pack13 = findViewById(R.id.pack13);
        Pack14 = findViewById(R.id.pack14);
        Pack15 = findViewById(R.id.pack15);
        Pack16 = findViewById(R.id.pack16);
        Pack17 = findViewById(R.id.pack17);
        Pack18 = findViewById(R.id.pack18);
        Pack19 = findViewById(R.id.pack19);
        Pack20 = findViewById(R.id.pack20);

        Pack121 = findViewById(R.id.pack121);

        spinner = findViewById(R.id.spinner);

        WTBTN = findViewById(R.id.btn1);
        Name = findViewById(R.id.chat_name);
        SName = findViewById(R.id.send_name);
        SYear = findViewById(R.id.send_year);
        getName = findViewById(R.id.get_name);
        getYear = findViewById(R.id.get_year);


        checkBox1 = findViewById(R.id.check1);
        checkBox2 = findViewById(R.id.check2);
        checkBox3 = findViewById(R.id.check3);
        checkBox4 = findViewById(R.id.check4);
        checkBox5 = findViewById(R.id.check5);
        checkBox6 = findViewById(R.id.check6);
        checkBox7 = findViewById(R.id.check7);

        BTN = findViewById(R.id.btn2);
        EndText = findViewById(R.id.end_text);


        count = 0;
        save1 = 0;

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        typing.setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                typing.setVisibility(View.INVISIBLE);
                Pack2.setVisibility(View.VISIBLE);
                Pack3.setVisibility(View.VISIBLE);
                Pack4.setVisibility(View.VISIBLE);



            }
        }, 2000);

        WTBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pack4.setVisibility(View.INVISIBLE);
                Pack5.setVisibility(View.VISIBLE);
                typing.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        typing.setVisibility(View.INVISIBLE);
                        Pack6.setVisibility(View.VISIBLE);
                        typing.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Pack7.setVisibility(View.VISIBLE);
                                Pack8.setVisibility(View.VISIBLE);
                                typing.setVisibility(View.INVISIBLE);
                                Toast.makeText(MainActivity.this, "New messages", Toast.LENGTH_SHORT).show();

                            }
                        }, 2000);




                    }
                }, 2000);


            }
        });


        SName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Name.getText().toString().trim().length() == 0){

                    Toast.makeText(MainActivity.this, "Enter Your Name", Toast.LENGTH_SHORT).show();

                }
                else {
                    //save1 =  save1 + 3;
                    Pack8.setVisibility(View.INVISIBLE);
                    Pack9.setVisibility(View.VISIBLE);
                    String name = Name.getText().toString();
                    getName.setText(name);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    typing.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            typing.setVisibility(View.INVISIBLE);
                            Pack10.setVisibility(View.VISIBLE);
                            typing.setVisibility(View.VISIBLE);
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Pack11.setVisibility(View.VISIBLE);
                                    Pack12.setVisibility(View.VISIBLE);
                                    typing.setVisibility(View.INVISIBLE);
                                }
                            }, 2000);

                        }
                    }, 2000);

                }


                SYear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Pack12.setVisibility(View.INVISIBLE);
                        String SYear = spinner.getSelectedItem().toString();
                        getYear.setText(SYear);
                        year = Integer.parseInt(SYear);
                        Pack121.setVisibility(View.VISIBLE);
                        typing.setVisibility(View.VISIBLE);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                if(year > 1970){

                                    typing.setVisibility(View.INVISIBLE);
                                    Toast.makeText(MainActivity.this, "New messages", Toast.LENGTH_SHORT).show();
                                    Pack13.setVisibility(View.VISIBLE);

                                }
                                else {
                                    typing.setVisibility(View.INVISIBLE);
                                    Toast.makeText(MainActivity.this, "New messages", Toast.LENGTH_SHORT).show();
                                    Pack14.setVisibility(View.VISIBLE);
                                }

                                typing.setVisibility(View.VISIBLE);
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        typing.setVisibility(View.INVISIBLE);
                                        Toast.makeText(MainActivity.this, "New messages", Toast.LENGTH_SHORT).show();
                                        Pack15.setVisibility(View.VISIBLE);

                                        typing.setVisibility(View.VISIBLE);

                                        new Handler().postDelayed(new Runnable() {
                                            @Override
                                            public void run() {

                                                    typing.setVisibility(View.INVISIBLE);
                                                    Toast.makeText(MainActivity.this, "New messages", Toast.LENGTH_SHORT).show();
                                                    Pack16.setVisibility(View.VISIBLE);
                                                    Pack17.setVisibility(View.VISIBLE);
                                                    Pack19.setVisibility(View.VISIBLE);


                                            }
                                        }, 5000);

                                    }
                                }, 5000);

                            }
                        }, 3000);



                    }
                });



            }
        });


        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pack19.setVisibility(View.INVISIBLE);
                Pack20.setVisibility(View.VISIBLE);


                if (checkBox1.isChecked()) {
                    ++count;
                }

                if (checkBox2.isChecked()) {
                    ++count;
                }

                if (checkBox3.isChecked()) {
                    ++count;
                }
                if (checkBox4.isChecked()) {
                    ++count;
                }

                if (checkBox5.isChecked()) {
                    ++count;
                }

                if (checkBox6.isChecked()) {
                    ++count;
                }
                if (checkBox7.isChecked()) {
                    ++count;
                }



                if(count > 2){

                    Pack18.setVisibility(View.VISIBLE);

                }

            }
        });




    }


    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("LEAVE?")
                .setMessage("If you leave you would have to start all over again.")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton("LEAVE", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                       finish();

                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton("CANCEL", null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();



    }
}
