package com.example.viewpagre2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager1);
        // String s1[]={"Monet","Maruti","Ashmar","Concentrix"};
        Adapter adapter = new Adapter(this);
        viewPager.setAdapter(adapter);
    }
}
