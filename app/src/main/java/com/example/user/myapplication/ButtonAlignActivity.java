package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonAlignActivity extends AppCompatActivity {

    private TextView tv_btn_nm = null;
    private Button btn1, btn2, btn3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_align);
        tv_btn_nm=findViewById(R.id.tv_btn_nm);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
    }

    public void clkBtn(View v){
        Button btn = (Button) v;
        tv_btn_nm.setText(btn.getText());

        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");

        if(v.getId()==R.id.btn_1){
            btn2.setText("0");
            btn3.setText("0");
        } else if(v.getId()==R.id.btn_2){
            btn1.setText("0");
            btn3.setText("0");
        } else if(v.getId()==R.id.btn_3){
            btn1.setText("0");
            btn2.setText("0");
        }
    }

}
