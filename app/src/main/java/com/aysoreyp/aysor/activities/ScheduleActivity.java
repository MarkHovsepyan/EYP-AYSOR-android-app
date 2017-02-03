package com.aysoreyp.aysor.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.aysoreyp.aysor.R;
import com.aysoreyp.aysor.adapter.ScheduleAdapter;

public class ScheduleActivity extends AppCompatActivity {

    private RecyclerView scheduleRecycler;
    private ScheduleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int day = getIntent().getExtras().getInt("day");
        getSupportActionBar().setTitle("Day " + (day+1));


        adapter = new ScheduleAdapter(this, day);

        setContentView(R.layout.activity_schedule);

        scheduleRecycler = (RecyclerView) findViewById(R.id.schedule_recycler);
        scheduleRecycler.setLayoutManager(new LinearLayoutManager(this));
        scheduleRecycler.setHasFixedSize(true);
        scheduleRecycler.setAdapter(adapter);
    }
}
