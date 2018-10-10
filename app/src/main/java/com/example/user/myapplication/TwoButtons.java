package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TwoButtons extends AppCompatActivity {

    private Button btn1, btn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_buttons);
        init();
    }

    public void init(){
        btn1 = findViewById(R.id.calcbutton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "이벤트 연결 성공");
                Toast.makeText(TwoButtons.this, "계산기", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TwoButtons.this, CalcActivity.class);
                startActivity(intent);
            }
        });

        btn2 = findViewById(R.id.playerbutton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TwoButtons.this,"플레이어",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TwoButtons.this, PlayerActivity.class);
                startActivity(intent);
            }
        });

    }
}