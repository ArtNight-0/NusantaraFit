package com.example.project_nusantarafit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class OrderActivity
        extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    MyorderViewPager myorderViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nusantara_my_order);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabs);

        myorderViewPager = new MyorderViewPager(
                getSupportFragmentManager());
        viewPager.setAdapter(myorderViewPager);

        // It is used to join TabLayout with ViewPager.
        tabLayout.setupWithViewPager(viewPager);
    }
}