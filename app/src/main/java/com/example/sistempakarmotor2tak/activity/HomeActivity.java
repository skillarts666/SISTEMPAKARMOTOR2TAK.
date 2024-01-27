package com.example.sistempakarmotor2tak.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.sistempakarmotor2tak.R;
import com.example.sistempakarmotor2tak.fragment.BerandaFragment;
import com.example.sistempakarmotor2tak.fragment.TentangFragment;

public class HomeActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    View beranda, bantuan, tentang;
    ImageView imgBeranda, imgTentang;
    TextView textBeranda, textTentang;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        beranda            = findViewById(R.id.btn_beranda);
        tentang            = findViewById(R.id.btn_tentang);
        imgBeranda         = findViewById(R.id.image_beranda);
        imgTentang         = findViewById(R.id.image_tentang);
        textBeranda        = findViewById(R.id.text_beranda);
        textTentang        = findViewById(R.id.text_tentang);


        imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.ic_bernanda_checked));
        textBeranda.setTextColor(getResources().getColor(R.color.green));
        setFragment(new BerandaFragment());
        setEventFragment();

    }

    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.transition, fragment);
        fragmentTransaction.commit();
    }

    private void setEventFragment() {
        beranda.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new BerandaFragment());
                imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.ic_bernanda_checked));
                imgTentang.setImageDrawable(getResources().getDrawable(R.drawable.ic_tentang));

                textBeranda.setTextColor(getResources().getColor(R.color.green));
                textTentang.setTextColor(getResources().getColor(R.color.green));
            }
        });


        tentang.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new TentangFragment());
                imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.ic_beranda));
                imgTentang.setImageDrawable(getResources().getDrawable(R.drawable.ic_tentang_checked));


                textBeranda.setTextColor(getResources().getColor(R.color.green));
                textTentang.setTextColor(getResources().getColor(R.color.green));
            }
        });


    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}