package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    String toatMSG = "";
    int firstValue, secondValue, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.fistValue);
        etSecondValue = findViewById(R.id.secondValue);
    }


    public void onPlusClick(View view) {
        firstValue = Integer.parseInt(etFirstValue.getText().toString());
        secondValue = Integer.parseInt(etSecondValue.getText().toString());
        result = firstValue + secondValue;
        toatMSG = "Result: " + result;
        Toast.makeText(getApplicationContext(), toatMSG, Toast.LENGTH_SHORT).show();
    }
}