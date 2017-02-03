package com.aysoreyp.aysor.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aysoreyp.aysor.R;
import com.aysoreyp.aysor.adapter.CommitteeAdapter;


public class CommiteesFragment extends Fragment {

    private final int NUM_COLUMNS = 2;

    private RecyclerView rv;
    private CommitteeAdapter adapter;

    public CommiteesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_commitees, container, false);

        rv = (RecyclerView) v.findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new GridLayoutManager(getContext(), NUM_COLUMNS));

        adapter = new CommitteeAdapter(getContext());

        rv.setAdapter(adapter);

        return v;
    }


}
