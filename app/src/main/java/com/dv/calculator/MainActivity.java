package com.dv.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView result;
    private TextView q;
    private Button ac;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button decimal;
    private Button equal;
    private Button percentage;

    private final String TAG = this.getClass().getCanonicalName();

    private double answer=0;
    private int number=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.result = findViewById(R.id.result);

        this.q = findViewById(R.id.q);

        this.ac = findViewById(R.id.ac);
        this.ac.setOnClickListener(this);

        this.zero = findViewById(R.id.zero);
        this.zero.setOnClickListener(this);

        this.one = findViewById(R.id.one);
        this.one.setOnClickListener(this);

        this.two = findViewById(R.id.two);
        this.two.setOnClickListener(this);

        this.three = findViewById(R.id.three);
        this.three.setOnClickListener(this);

        this.four = findViewById(R.id.four);
        this.four.setOnClickListener(this);

        this.five = findViewById(R.id.five);
        this.five.setOnClickListener(this);

        this.six = findViewById(R.id.six);
        this.six.setOnClickListener(this);

        this.seven = findViewById(R.id.seven);
        this.seven.setOnClickListener(this);

        this.eight = findViewById(R.id.eight);
        this.eight.setOnClickListener(this);

        this.nine = findViewById(R.id.nine);
        this.nine.setOnClickListener(this);

        this.add = findViewById(R.id.add);
        this.add.setOnClickListener(this);

        this.subtract = findViewById(R.id.subtract);
        this.subtract.setOnClickListener(this);

        this.multiply = findViewById(R.id.multiply);
        this.multiply.setOnClickListener(this);

        this.divide = findViewById(R.id.divide);
        this.divide.setOnClickListener(this);

        this.decimal = findViewById(R.id.decimal);
        this.decimal.setOnClickListener(this);

        this.equal = findViewById(R.id.equal);
        this.equal.setOnClickListener(this);

        this.percentage = findViewById(R.id.percent);
        this.percentage.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v!= null){
            switch (v.getId()){
                case R.id.ac:{
                    answer = 0;
                    result.setText("");
                    q.setText("");
                    break;
                }

                case R.id.zero:{
                    number = 0;
                    q.append("0");
                    break;
                }

                case R.id.one:{
                    number = 1;
                    q.append("1");
                    break;
                }

                case R.id.two:{
                    number = 2;
                    q.append("2");
                    break;
                }

                case R.id.three:{
                    number = 3;
                    q.append("3");
                    break;
                }

                case R.id.four:{
                    number = 4;
                    q.append("4");
                    break;
                }

                case R.id.five:{
                    number = 5;
                    q.append("5");
                    break;
                }

                case R.id.six:{
                    number = 6;
                    q.append("6");
                    break;
                }

                case R.id.seven:{
                    number = 7;
                    q.append("7");
                    break;
                }

                case R.id.eight:{
                    number = 8;
                    q.append("8");
                    break;
                }

                case R.id.nine:{
                    number = 9;
                    q.append("9");
                    break;
                }

                case R.id.add:{
                    answer += number;
                    q.append(" + ");
                    break;
                }

                case R.id.subtract:{
                    answer -= number;
                    q.append(" - ");
                    break;
                }

                case R.id.divide:{
                    answer /= number;
                    q.append(" / ");
                    break;
                }

                case R.id.multiply:{
                    answer *= number;
                    q.append(" * ");
                    break;
                }

                case R.id.percent:{
                    answer %= number;
                    q.append(" % ");
                    break;
                }

                case R.id.decimal:{
                    q.append(".");
                    break;
                }

                case R.id.equal:{
                    result.setText(String.valueOf(answer + number));
                    Log.d(TAG, "onClick: " + (answer + number));
                    break;
                }

            }
        }

    }
}