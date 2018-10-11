package com.example.tristenspruill.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class squareCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_calc);
    }

    public void areacalc(View view) {
        TextView areaDisplay = findViewById(R.id.areaDisplay);
        EditText lengthInput = findViewById(R.id.lengthInput);
        EditText widthtInput = findViewById(R.id.widthInput);
        double width = Double.parseDouble(widthtInput.getText().toString());
        double length = Double.parseDouble(lengthInput.getText().toString());
        double area =  (width * length);
        String areastring = Double.toString(area);
        areaDisplay.setText(areastring);

    }


}
