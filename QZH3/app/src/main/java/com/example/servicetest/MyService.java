package com.example.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
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
        Log.d("MyService","onCreate executed");
    }
    @Override
    public int onStartCommand(Intent intent,int flags,int starId) {
        Log.d("MyService","onStartCommand executed");
        return super.onStartCommand(intent,flags,starId);
    }
    @Override
    public void onDestroy() {

        super.onDestroy();
        Log.d("MyService","onDestroy executed");
    }
}