package com.example.a15017206.p09demofilereadwriting;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;

public class MyService extends Service {

    boolean started;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("Service", "Created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (started == false){
            started = true;
            Log.i("Service", "Started");
        } else {
            Log.i("Service", "Still running");
        }
        return Service.START_STICKY;

    }

    @Override
    public void onDestroy() {
        Log.i("Service", "Exited");
        super.onDestroy();
    }
}
