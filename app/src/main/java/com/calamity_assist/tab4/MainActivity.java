package com.calamity_assist.tab4;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class    MainActivity extends AppCompatActivity {


    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    viewPagerAdpater viewPagerAdpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        viewPagerAdpater=new viewPagerAdpater(getSupportFragmentManager());
        viewPagerAdpater.addFragment(new HomeFragment(),"home");
        viewPagerAdpater.addFragment(new TopFreeFragment(),"top");
        viewPagerAdpater.addFragment(new TopPaid(),"topPaid");

        viewPager.setAdapter(viewPagerAdpater);
        tabLayout.setupWithViewPager(viewPager);


    }
}
