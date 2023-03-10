package edu.uic.cs478.project3;

import static android.content.Intent.ACTION_MAIN;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button nyButton = findViewById(R.id.nyButton);
        Button flButton = findViewById(R.id.flButton);

        nyButton.setOnClickListener(nyClick);
        flButton.setOnClickListener(flClick);

    }
    public View.OnClickListener nyClick = v->{
        //intent for activity 2
        Toast.makeText(MainActivity.this, "You Selected New York City!",
                Toast.LENGTH_SHORT).show();
        Log.i("Main", "Starting intent broadcast");
        Intent i = new Intent("edu.uic.cs478.project3_a2.broadcastRec");
        i.putExtra("edu.uic.cs478.project3_a2.Selection", "NEW_YORK");
        sendBroadcast(i);
    };

    public View.OnClickListener flClick = v->{
        //intent for activity 2
        Toast.makeText(MainActivity.this, "You Selected Orlando!",
                Toast.LENGTH_SHORT).show();
            Intent i = new Intent("edu.uic.cs478.project3_a2.broadcastRec");
            i.putExtra("edu.uic.cs478.project3_a2.Selection", "ORLANDO");
            sendBroadcast(i);
    };
}