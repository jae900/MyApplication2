package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrintStarActivity extends AppCompatActivity {
    private EditText et = null;
    private Button bt = null;
    private TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("별찍기");
        et = findViewById(R.id.printEditText);
        Button bt =  findViewById(R.id.printButton);
        tv =  findViewById(R.id.printView);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int no = 0;

                try{
                    no = Integer.parseInt(et.getText().toString());

                    String result = "";
                    for(int i = 0 ; i<no; i++){
                        for(int j = 0; j<i+1; j++){
                            result += "*";
                        }
                            result+="\n";
                     }

                     tv.setText(result);
                } catch(Exception e){
                    tv.setText("숫자를 넣으십쇼!");
                }
            }
         }
         );
    }
}

