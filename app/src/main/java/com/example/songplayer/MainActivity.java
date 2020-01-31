package com.example.songplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {




    private MediaPlayer mp;
    public void play(View v) {
        Button buttonp =(Button)v;
        stopPlaying();
        mp = MediaPlayer.create(this, getResources().getIdentifier(buttonp.getTag().toString(), "raw", getPackageName()));
        mp.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
        private void stopPlaying() {
            if (mp != null) {
                mp.stop();
                mp.release();
                mp = null;
            }
        }
}
