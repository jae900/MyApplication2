package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_hello=null, tv_name=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_hello=findViewById(R.id.tv_hello);
        tv_name=findViewById(R.id.tv_name);

        tv_hello.setText("123");
        tv_name.setText(R.string.change);

    }
}
