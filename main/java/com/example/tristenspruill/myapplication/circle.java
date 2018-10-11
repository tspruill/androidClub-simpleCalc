package com.example.tristenspruill.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class circle extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    public void areacalc(View view) {
        TextView areaDisplay = findViewById(R.id.areaDisplay);
        EditText radiusInput = findViewById(R.id.radiusInput);
        double radius = Double.parseDouble(radiusInput.getText().toString());
        double area = (Math.PI * (radius * radius));
        String areastring = Double.toString(area);
        areaDisplay.setText(areastring);

    }

}

