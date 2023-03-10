package edu.uic.cs478.project3_a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class broadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if("edu.uic.cs478.project3_a2.broadcastRec".equals(intent.getAction())){
//            String selection = intent.getStringExtra("edu.uic.cs478.project3_a2.Selection");
//            Log.i("BROADCAST", "SELECTED: " + selection);
//            Intent i = new Intent(context, splashActivity.class);
//            i.putExtra("Selection", selection);
//            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//            context.startActivity(i);
            String selection = intent.getStringExtra("edu.uic.cs478.project3_a2.Selection");
            Log.i("BROADCAST", "SELECTED: " + selection);
            Intent i = new Intent(context, splashActivity.class);
            i.putExtra("Selection", selection);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}
