package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {
    private Button equals, clear;
    private TextView firstValue, secondValue;
    private TextView operator, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        init();

    }

    public void init(){
        getSupportActionBar().setTitle("계산기");
        firstValue = findViewById(R.id.firstValue);
        /**firstValue.setShowSoftInputOnFocus(false);**/
        secondValue=findViewById(R.id.secondValue);
        /**secondValue.setShowSoftInputOnFocus(false);**/
        operator = findViewById(R.id.operator);
        result = findViewById(R.id.result);

        clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue.setText("");
                secondValue.setText("");
                result.setText("");
                operator.setText("");
            }
        });

        equals = findViewById(R.id.equals);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    int first = Integer.parseInt(firstValue.getText().toString());
                    int second = Integer.parseInt(secondValue.getText().toString());
                    String opr = operator.getText().toString();
                    int calc = 0;

                    switch(opr){
                        case "+" :
                            calc = first+second;
                            break;
                        case "-" :
                            calc = first-second;
                            break;
                        case "*":
                            calc = first*second;
                            break;
                        case "/":
                            calc = first/second;
                    }

                    String calcedNum = calc+"";
                    result.setText(calcedNum);
                }catch(Exception e){
                    result.setText("망함");
                }

            }
        });
    }
    public void clkBtn(View v){
        Button btn = (Button) v;
        if(operator.getText()==""){
            firstValue.setText(firstValue.getText().toString()+btn.getText());
        } else{
            secondValue.setText(secondValue.getText().toString()+btn.getText());
        }
    }

    public void changeOperator(View v){
        if(v instanceof Button){
            Button btn = (Button) v;
            String op = btn.getText().toString();
            operator.setText(op);
        }

    }
}
