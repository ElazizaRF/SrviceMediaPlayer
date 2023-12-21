package com.re.servicemediaplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {

    MediaPlayer mp;
    public MyService() {
    }

    public int onStartCommand(Intent intent,int flag,int startId) {
        mp = MediaPlayer.create(this,R.raw.interlude_dawn);
        //mp = MediaPlayer.create(this,R.raw.island_in_the_seom);
        mp.setLooping(false);
        mp.start();
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
    }
}
