package com.aysoreyp.aysor.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;


import com.aysoreyp.aysor.R;
import com.aysoreyp.aysor.activities.CommitteeDetailActivity;
import com.squareup.picasso.Picasso;

public class CommitteeAdapter extends RecyclerView.Adapter<CommitteeAdapter.ViewHolder>{

    private int[] logos = {
            R.drawable.commitee_1,
            R.drawable.commitee_2,
            R.drawable.commitee_3,
            R.drawable.commitee_4,
            R.drawable.commitee_5,
            R.drawable.commitee_6,

    };

    private Context mCtx;

    public CommitteeAdapter(Context ctx) {
        mCtx = ctx;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView committeeLogo;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            committeeLogo = (ImageView) itemView.findViewById(R.id.committee_logo);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(mCtx, CommitteeDetailActivity.class);
            int position = getAdapterPosition();
            intent.putExtra("position", position); //use  getIntent().getExtras().getInt("position") to retrieve this number
            mCtx.startActivity(intent);
        }

    }

    @Override
    public CommitteeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context ctx = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(ctx);

        View v = inflater.inflate(R.layout.committee_grid_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CommitteeAdapter.ViewHolder holder, int position) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)holder.committeeLogo.getLayoutParams();
        if (position%2 == 1) {
            params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        } else {
            params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        }

        holder.committeeLogo.setLayoutParams(params);

        Picasso.with(mCtx).load(logos[position]).into(holder.committeeLogo);
        //holder.committeeLogo.setImageResource(logos[position]);
    }

    @Override
    public int getItemCount() {
        return logos.length;
    }
}
