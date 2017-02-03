package com.aysoreyp.aysor.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aysoreyp.aysor.R;
import com.aysoreyp.aysor.adapter.ViewPagerAdapter;
import com.aysoreyp.aysor.tabs.SlidingTabLayout;

public class MainActivity extends AppCompatActivity {

    SlidingTabLayout tabs;
    ViewPager pager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        pager = (ViewPager) findViewById(R.id.main_pager);
        pager.setAdapter(adapter);

        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);
        tabs.setCustomTabView(R.layout.tab_layout, R.id.tab_logo);
        tabs.setViewPager(pager);
    }
}
