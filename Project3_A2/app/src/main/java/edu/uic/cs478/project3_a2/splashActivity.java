package edu.uic.cs478.project3_a2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class splashActivity extends AppCompatActivity {
    broadcastReceiver BR = new broadcastReceiver();
    protected String selection = "NEW_YORK";
    protected String NY = "NEW_YORK";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        selection = intent.getStringExtra("Selection");
        if(selection == null){
            selection = "NEW_YORK";
        }

        setContentView(R.layout.splash);
        Log.i("BROADCAST","SPLASH ACTIVITY HERE!");
        IntentFilter filter = new IntentFilter("edu.uic.cs478.project3_a2.broadcastRec");
        registerReceiver(BR,filter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // on below line we are
                // creating a new intent

                Log.i("Main", "My Selection: " + selection);
                if(selection.equals(NY)){
                    Log.i("Main", "NEW YORK");
                    Intent i = new Intent(splashActivity.this, NewYork.class);
                    // on below line we are
                    // starting a new activity.
                    startActivity(i);
                } else {
                    Log.i("Main", "ORLANDO");
                    Intent i = new Intent(splashActivity.this, Orlando.class);
                    // on below line we are
                    // starting a new activity.
                    startActivity(i);
                }

                // on the below line we are finishing
                // our current activity.
                finish();
            }
        }, 2000);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
//        unregisterReceiver(BR);
    }


}


