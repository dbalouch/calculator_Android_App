package com.sach.calculator;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etfirstvalue, etsecondvalue;
    TextView etresult;
    Button Add, subtraction, multiply, divide ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirstvalue = findViewById(R.id.etFIRSTvalue);
        etsecondvalue = findViewById(R.id.etSECONDvalue);
        etresult = findViewById(R.id.tvAnswer);
        Add = findViewById(R.id.btnAddition);
        subtraction = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivision);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue, secondvalue, ans;

                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue  = Integer.parseInt(etsecondvalue.getText().toString());

                ans = firstvalue + secondvalue;

                etresult.setText("Ans is = "+ans);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue, secondvalue, ans;

                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue  = Integer.parseInt(etsecondvalue.getText().toString());

                ans = firstvalue - secondvalue;

                etresult.setText("Ans is = "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue, secondvalue, ans;

                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue  = Integer.parseInt(etsecondvalue.getText().toString());

                ans = firstvalue * secondvalue;

                etresult.setText("Ans is = "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue, secondvalue, ans;

                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue  = Integer.parseInt(etsecondvalue.getText().toString());

                ans = firstvalue / secondvalue;

                etresult.setText("Ans is = "+ans);
            }
        });
    }
}