package com.example.mycalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    Button ac, back, percent, divide, times, minus, plus, _0, _1, _2, _3, _4, _5, _6, _7, _8, _9, dot, _p_n, equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        editText = findViewById(R.id.editText);
        ac = findViewById(R.id.ac);
        back = findViewById(R.id.back);
        percent = findViewById(R.id.percent);
        divide = findViewById(R.id.divide);
        times = findViewById(R.id.times);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        _0 = findViewById(R.id._0);
        _1 = findViewById(R.id._1);
        _2 = findViewById(R.id._2);
        _3 = findViewById(R.id._3);
        _4 = findViewById(R.id._4);
        _5 = findViewById(R.id._5);
        _6 = findViewById(R.id._6);
        _7 = findViewById(R.id._7);
        _8 = findViewById(R.id._8);
        _9 = findViewById(R.id._9);
        dot = findViewById(R.id.dot);
        _p_n = findViewById(R.id._p_n);
        equal = findViewById(R.id.equal);
        ac.setOnClickListener(this);
        back.setOnClickListener(this);
        percent.setOnClickListener(this);
        divide.setOnClickListener(this);
        times.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus.setOnClickListener(this);
        _0.setOnClickListener(this);
        _1.setOnClickListener(this);
        _2.setOnClickListener(this);
        _3.setOnClickListener(this);
        _4.setOnClickListener(this);
        _5.setOnClickListener(this);
        _6.setOnClickListener(this);
        _7.setOnClickListener(this);
        _8.setOnClickListener(this);
        _9.setOnClickListener(this);
        dot.setOnClickListener(this);
        _p_n.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ac:
                editText.setText("");
                break;


            case R.id.back:
                break;


            case R.id.percent:
                break;

            case R.id.divide:
                break;

            case R.id.times:
                break;

            case R.id.minus:
                break;

            case R.id.plus:
                break;


            case R.id._0:
                break;


            case R.id._1:
                break;


            case R.id._2:
                break;


            case R.id._3:
                break;


            case R.id._4:
                break;


            case R.id._5:
                break;


            case R.id._6:
                break;


            case R.id._7:
                break;


            case R.id._8:
                break;


            case R.id._9:
                break;


            case R.id.dot:
                break;


            case R.id._p_n:
                break;


            case R.id.equal:
                break;
        }


    }
}
