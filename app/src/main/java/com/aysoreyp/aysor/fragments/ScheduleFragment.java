package com.aysoreyp.aysor.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.aysoreyp.aysor.R;
import com.aysoreyp.aysor.activities.ScheduleActivity;
import com.aysoreyp.aysor.adapter.ScheduleAdapter;


public class ScheduleFragment extends Fragment implements View.OnClickListener{

    ImageView day1;
    ImageView day2;
    ImageView day3;
    ImageView day4;

    public ScheduleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_schedule, container, false);

        day1 = (ImageView) v.findViewById(R.id.day_bt_1);
        day2 = (ImageView) v.findViewById(R.id.day_bt_2);
        day3 = (ImageView) v.findViewById(R.id.day_bt_3);
        day4 = (ImageView) v.findViewById(R.id.day_bt_4);

        day1.setOnClickListener(this);
        day2.setOnClickListener(this);
        day3.setOnClickListener(this);
        day4.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View v) {
        int position = -1;
        if(v == day1) {
            position = 0;
        } else if (v == day2) {
            position = 1;
        } else if (v == day3) {
            position = 2;
        } else if (v == day4) {
            position = 3;
        }

        if (position != -1) {
            Intent i = new Intent(getContext(), ScheduleActivity.class);
            i.putExtra("day", position);
            startActivity(i);
        }

    }
}
