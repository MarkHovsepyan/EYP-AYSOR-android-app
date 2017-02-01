package com.aysoreyp.aysor.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.aysoreyp.aysor.R;

public class CommitteeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee_detail);

        int position = getIntent().getExtras().getInt("position");

        //TODO: Remove this
        Toast.makeText(this, "Item number " + position + " clicked", Toast.LENGTH_SHORT).show();

    }
}
