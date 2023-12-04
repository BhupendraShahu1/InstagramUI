package com.example.instagram;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.instagram.Adopter.ViewPagerAdopter.ViewPagerAdopter;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdopter viewPagerAdopter = new ViewPagerAdopter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdopter);
    }
}