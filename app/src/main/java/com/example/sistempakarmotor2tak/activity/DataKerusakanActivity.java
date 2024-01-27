package com.example.sistempakarmotor2tak.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sistempakarmotor2tak.KonsultasiAct;
import com.example.sistempakarmotor2tak.R;

public class DataKerusakanActivity extends AppCompatActivity {

    private LinearLayout k1;
    private LinearLayout k2;
    private LinearLayout k4;
    private LinearLayout k5;
    private LinearLayout k6;
    private LinearLayout k7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kerusakan);


        k1 = (LinearLayout) findViewById(R.id.k1);
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.sistempakarmotor2tak.activity.DataKerusakanActivity.this, kerusakan1.class);
                startActivity(intent);
            }
        });

        k2 = (LinearLayout) findViewById(R.id.k2);
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.sistempakarmotor2tak.activity.DataKerusakanActivity.this, kerusakan2.class);
                startActivity(intent);
            }
        });

        LinearLayout k3 = (LinearLayout) findViewById(R.id.k3);
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.sistempakarmotor2tak.activity.DataKerusakanActivity.this, kerusakan3.class);
                startActivity(intent);
            }
        });

        k4 = (LinearLayout) findViewById(R.id.k4);
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.sistempakarmotor2tak.activity.DataKerusakanActivity.this, kerusakan4.class);
                startActivity(intent);
            }
        });

        k5 = (LinearLayout) findViewById(R.id.k5);
        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.sistempakarmotor2tak.activity.DataKerusakanActivity.this, kerusakan5.class);
                startActivity(intent);
            }
        });

        k6 = (LinearLayout) findViewById(R.id.k6);
        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.sistempakarmotor2tak.activity.DataKerusakanActivity.this, kerusakan6.class);
                startActivity(intent);
            }
        });

        k7 = (LinearLayout) findViewById(R.id.k7);
        k7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.sistempakarmotor2tak.activity.DataKerusakanActivity.this, kerusakan7.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(DataKerusakanActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
        }

}