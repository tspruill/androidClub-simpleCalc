package com.example.tristenspruill.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void circleImage(View view) {
        Intent intent = new Intent(this, circle.class);
        startActivity(intent);
    }

    public void squareImage(View view) {
        Intent intent = new Intent(this, squareCalc.class);
        startActivity(intent);
    }

    public void triangleImage(View view) {
        Intent intent = new Intent(this, triCalc.class);
        startActivity(intent);
    }
}
