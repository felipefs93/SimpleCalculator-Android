package com.soaresfelipef.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText editTextNumber1;
    public EditText editTextNumber2;
    public TextView textViewResult;
    public Button btnAdd;
    public Button btnSubtract;
    public Button btnMultiply;
    public Button btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        textViewResult = (TextView) findViewById(R.id.textView);

    }
}
