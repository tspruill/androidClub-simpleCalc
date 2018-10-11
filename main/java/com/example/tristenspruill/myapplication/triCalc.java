package com.example.tristenspruill.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class triCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tri_calc);
    }

    public void areacalc(View view) {
        TextView areaDisplay = findViewById(R.id.areaDisplay);
        EditText baseInput = findViewById(R.id.baseInput);
        EditText heightInput = findViewById(R.id.heightInput);
        double base = Double.parseDouble(baseInput.getText().toString());
        double height = Double.parseDouble(heightInput.getText().toString());
        double area = (0.5 * (base * height));
        String areastring = Double.toString(area);
        areaDisplay.setText(areastring);

    }

}
