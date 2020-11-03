package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    private final String ACTION = BuildConfig.APPLICATION_ID+".ACTION_BROADCAST_CUSTOM";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String action = intent.getAction();
        if ( action != null){
            switch (action){
                case ACTION:
                    Toast.makeText(context, "Custom Broadcast received.", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}