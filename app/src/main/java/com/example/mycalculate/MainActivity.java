package com.example.mycalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView editText;
    Button ac, back, percent, divide, times, minus, plus, _0, _1, _2, _3, _4, _5, _6, _7, _8, _9, dot, _p_n, equal;
    String num = "";
    Double cal, cal2;
    Integer flag;

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
        try {
            switch (view.getId()) {
                case R.id.ac:
                    num = "";
                    editText.setText(num);
                    break;


                case R.id.back:
                    num = num.substring(0, num.length() - 1);
                    editText.setText(num);
                    break;


                case R.id.percent:
                    cal = Double.parseDouble(num);
                    cal /= 100;
                    editText.setText(cal.toString());
                    break;

                case R.id.divide:
                    cal2 = Double.parseDouble(num);
                    num = "";
                    editText.setText(num);
                    flag = 4;
                    break;


                case R.id.times:
                    cal2 = Double.parseDouble(num);
                    num = "";
                    editText.setText(num);
                    flag = 3;
                    break;


                case R.id.minus:
                    cal2 = Double.parseDouble(num);
                    num = "";
                    editText.setText(num);
                    flag = 2;
                    break;

                case R.id.plus:
                    cal2 = Double.parseDouble(num);
                    num = "";
                    editText.setText(num);
                    flag = 1;
                    break;


                case R.id._0:
                    num += '0';
                    editText.setText(num);
                    break;


                case R.id._1:
                    num += '1';
                    editText.setText(num);
                    break;


                case R.id._2:
                    num += '2';
                    editText.setText(num);
                    break;


                case R.id._3:
                    num += '3';
                    editText.setText(num);
                    break;


                case R.id._4:
                    num += '4';
                    editText.setText(num);
                    break;


                case R.id._5:
                    num += '5';
                    editText.setText(num);
                    break;


                case R.id._6:
                    num += '6';
                    editText.setText(num);
                    break;


                case R.id._7:
                    num += '7';
                    editText.setText(num);
                    break;


                case R.id._8:
                    num += '8';
                    editText.setText(num);
                    break;


                case R.id._9:
                    num += '9';
                    editText.setText(num);
                    break;


                case R.id.dot:
                    num += '.';
                    editText.setText(num);
                    break;


                case R.id._p_n:
                    cal = Double.parseDouble(num);
                    cal *= -1;
                    editText.setText(cal.toString());
                    break;


                case R.id.equal:
                    cal = Double.parseDouble(num);
                    switch (flag) {
                        case 1:
                            cal = cal2 + cal;
                            editText.setText(cal.toString());
                            break;
                        case 2:
                            cal = cal2 - cal;
                            editText.setText(cal.toString());
                            break;
                        case 3:
                            cal = cal2 * cal;
                            editText.setText(cal.toString());
                            break;
                        case 4:
                            cal = cal2 / cal;
                            editText.setText(cal.toString());
                            break;
                    }
                    num = "";
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    editText.setText("Error");
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
                }
            });
        }


    }
}
