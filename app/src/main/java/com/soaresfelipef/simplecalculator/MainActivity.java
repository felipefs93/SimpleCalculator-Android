package com.soaresfelipef.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText editTextNumber1;
    public EditText editTextNumber2;
    public TextView textViewResult;
    public Button btnAdd;
    public Button btnSubtract;
    public Button btnMultiply;
    public Button btnDivide;
    public Double result;
    public Double number1;
    public Double number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        textViewResult = (TextView) findViewById(R.id.textView);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        number1 = Double.parseDouble(editTextNumber1.getText().toString());
        number2 = Double.parseDouble(editTextNumber2.getText().toString());

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"The add button was clicked", Toast.LENGTH_LONG).show();
                result = number1 + number2;
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"The add button was clicked", Toast.LENGTH_LONG).show();
                result = number1 - number2;
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"The add button was clicked", Toast.LENGTH_LONG).show();
                result = number1 * number2;
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"The add button was clicked", Toast.LENGTH_LONG).show();
                result = number1 / number2;
            }
        });
    }
}
