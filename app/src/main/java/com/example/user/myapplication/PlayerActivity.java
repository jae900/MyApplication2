package com.example.user.myapplication;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends AppCompatActivity {
        private MediaPlayer mp ;
        Button btn3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        btn3 = findViewById(R.id.btn3);
    }

    public void clkBtn(View v){
        Log.i("test", "연결 성공!");

        switch(v.getId()){
            case R.id.btn1 :
                _doStop();
                mp = MediaPlayer.create(PlayerActivity.this, R.raw.muzik1);
                mp.start();
                btn3.setText(R.string.pause);
                break;
            case R.id.btn2:
                _doStop();
                mp = MediaPlayer.create(PlayerActivity.this, R.raw.muzik2);
                mp.start();
                btn3.setText(R.string.pause);
                break;
            case R.id.btn3:
                if(mp!=null){
                    Button btn = (Button) v;
                    String txt = btn.getText().toString();
                    if(txt.equals(getString(R.string.pause))){
                        btn.setText(R.string.play);
                        mp.pause();
                    } else {
                        btn.setText(R.string.pause);
                        mp.start();
                    }
                }
                break;
            case R.id.btn4:
                _doStop();
                btn3.setText(R.string.pause);
                break;

        }
    }

    private void _doStop(){
        if(mp!=null){
            mp.stop();
            mp.release();
            mp=null;
        }
    }
}
