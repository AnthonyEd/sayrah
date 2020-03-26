package com.irg.sayrah;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;

import java.util.ArrayList;
import java.util.List;

public class Donate extends AppCompatActivity implements PurchasesUpdatedListener {

    private BillingClient billingClient;
    String DONATE1 = "donate1dollar";
    String DONATE15 = "donate15dollars";
    String DONATE35 = "donate35dollars";
    String DONATE50 = "donate50dollars";
    String DONATE100 = "donate50dollars";

    Button D1;
    Button D2;
    Button D3;
    Button D4;
    Button D5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        Toolbar toolbar = findViewById(R.id.toolbarDonate);

        D1 = findViewById(R.id.d1);
        D2 = findViewById(R.id.d2);
        D3 = findViewById(R.id.d3);
        D4 = findViewById(R.id.d4);
        D5 = findViewById(R.id.d5);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        billingClient = BillingClient.newBuilder(Donate.this).setListener(this).build();
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingSetupFinished(int responseCode) {

            }

            @Override
            public void onBillingServiceDisconnected() {

            }
        });


        List SkuList = new ArrayList();
        SkuList.add(DONATE1);
        SkuList.add(DONATE15);
        SkuList.add(DONATE35);
        SkuList.add(DONATE50);
        SkuList.add(DONATE100);
        SkuDetailsParams.Builder params = SkuDetailsParams.newBuilder();
        params.setSkusList(SkuList).setType(BillingClient.SkuType.INAPP);
        billingClient.querySkuDetailsAsync(params.build(), new SkuDetailsResponseListener() {
            @Override
            public void onSkuDetailsResponse(int responseCode, List<SkuDetails> skuDetailsList) {

            }
        });



        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BillingFlowParams params1 = BillingFlowParams.newBuilder()
                        .setSku(DONATE1)
                        .setType(BillingClient.SkuType.INAPP)
                        .build();
                  int responseCode =  billingClient.launchBillingFlow(Donate.this, params1 );

            }
        });

        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BillingFlowParams params1 = BillingFlowParams.newBuilder()
                        .setSku(DONATE15)
                        .setType(BillingClient.SkuType.INAPP)
                        .build();
                int responseCode =  billingClient.launchBillingFlow(Donate.this, params1 );

            }
        });


        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BillingFlowParams params1 = BillingFlowParams.newBuilder()
                        .setSku(DONATE35)
                        .setType(BillingClient.SkuType.INAPP)
                        .build();
                int responseCode =  billingClient.launchBillingFlow(Donate.this, params1 );

            }
        });


        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BillingFlowParams params1 = BillingFlowParams.newBuilder()
                        .setSku(DONATE50)
                        .setType(BillingClient.SkuType.INAPP)
                        .build();
                int responseCode =  billingClient.launchBillingFlow(Donate.this, params1 );

            }
        });


        D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BillingFlowParams params1 = BillingFlowParams.newBuilder()
                        .setSku(DONATE100)
                        .setType(BillingClient.SkuType.INAPP)
                        .build();
                int responseCode =  billingClient.launchBillingFlow(Donate.this, params1 );

            }
        });



    }

    @Override
    public void onPurchasesUpdated(int responseCode, @Nullable List<Purchase> purchases) {

        if (purchases != null && responseCode == BillingClient.BillingResponse.OK){

            for (Purchase purchase : purchases)
            handlePurchase(purchase);

        }

    }


    private void handlePurchase(Purchase purchase){

        if(purchase.getSku() == DONATE1){

            new AlertDialog.Builder(this)
                    .setTitle("Thank YOU!")
                    .setMessage("Thank you very much for the donation.")

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton("NO, Worries", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Continue with delete operation
                            dialog.dismiss();

                        }
                    })

                    // A null listener allows the button to dismiss the dialog and take no further action.
                    //.setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

        }

        if(purchase.getSku() == DONATE15){


            new AlertDialog.Builder(this)
                    .setTitle("Thank YOU!")
                    .setMessage("Thank you very much for the donation.")

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton("NO, Worries", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Continue with delete operation
                            dialog.dismiss();

                        }
                    })

                    // A null listener allows the button to dismiss the dialog and take no further action.
                    //.setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

        }

        if(purchase.getSku() == DONATE35){


            new AlertDialog.Builder(this)
                    .setTitle("Thank YOU!")
                    .setMessage("Thank you very much for the donation.")

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton("NO, Worries", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Continue with delete operation
                            dialog.dismiss();

                        }
                    })

                    // A null listener allows the button to dismiss the dialog and take no further action.
                    //.setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

        }

        if(purchase.getSku() == DONATE50){


            new AlertDialog.Builder(this)
                    .setTitle("Thank YOU!")
                    .setMessage("Thank you very much for the donation.")

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton("NO, Worries", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Continue with delete operation
                            dialog.dismiss();

                        }
                    })

                    // A null listener allows the button to dismiss the dialog and take no further action.
                    //.setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

        }

        if(purchase.getSku() == DONATE100){

            new AlertDialog.Builder(this)
                    .setTitle("Thank YOU!")
                    .setMessage("Thank you very much for the donation.")

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton("NO, Worries", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Continue with delete operation
                            dialog.dismiss();

                        }
                    })

                    // A null listener allows the button to dismiss the dialog and take no further action.
                    //.setIcon(android.R.drawable.ic_dialog_alert)
                    .show();


        }

    }

}
