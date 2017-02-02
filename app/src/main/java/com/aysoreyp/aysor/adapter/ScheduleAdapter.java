package com.aysoreyp.aysor.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aysoreyp.aysor.R;

/**
 * Created by Narek Babajanyan on 2/3/2017.
 */

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ViewHolder> {
    Context mCtx;
    int mDay;


    private String[][] data = {
            {
                    "09:00 - 11:00 Arrival of international delegates",
                    "11:00 - 13:30 Teambuilding",
                    "13:30 - 14:00 Lunch break",
                    "14:00 - 16:30 Teambuilding (2)",
                    "16:30 - 17:30 Free time",
                    "17:30 - 18:00 Transfer to Opening Ceremony",
                    "18:00 - 20:00 Opening Ceremony and AYSOR talks",
                    "20:00 - 21:00 Reception/Networking evening"
            },

            {
                    "09:00 - 12:00 Committee work",
                    "12:00 - 12:15 Coffee break",
                    "12:15 - 15:00 Committee work (2)",
                    "15:00 - 15:30 Lunch break",
                    "15:30 - 18:00 Committee work (3)",
                    "18:00 - 19:00 Transfer to Eurovillage venue",
                    "19:00 - 21:00 Eurovillage, Cultural Night"
            },
            {
                    "08:30 - 09:00 Transfer to Cultural Breakfast venue",
                    "09:00 - 10:00 Cultural breakfast",
                    "10:00 - 10:30 Transfer to Committee work venue",
                    "10:30 - 13:30 Committee work (4)",
                    "13:30 - 14:00 Coffee break",
                    "14:00 - 16:00 Committee work (5)",
                    "16:00 - 16:30 Lunch break",
                    "16:30 - 18:00 GA Preparations",
                    "18:00 - 19:00 Free time",
                    "19:00 - 21:00 Talent night",
                    "21:00 - 23:00 Committee meeting"
            },
            {
                    "09:00 - 10:00 General Assembly opening",
                    "10:00 - 12:00 General Assembly 1",
                    "12:00 - 12:15 Coffee Break",
                    "12:15 - 14:15 General Assembly 2",
                    "14:15 - 14:30 Lunch break",
                    "14:30 - 16:30 General Assembly 3",
                    "16:30 - 17:00 Coffee break",
                    "17:00 - 18:00 Closing ceremony",
                    "18:00 - 20:00 Free time",
                    "20:00 - 00:00 Farewell party"
            }
    };


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView scheduleText;
        RelativeLayout scheduleContainer;

        public ViewHolder(View itemView) {
            super(itemView);

            scheduleText = (TextView) itemView.findViewById(R.id.schedule_text);
            scheduleContainer = (RelativeLayout) itemView.findViewById(R.id.schedule_container);
        }
    }

    public ScheduleAdapter(Context ctx, int day) {
        mCtx = ctx;
        mDay = day;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.schedule_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ScheduleAdapter.ViewHolder holder, int position) {

        //Alternating cell colors

        if(position%2 == 1) {
            holder.scheduleContainer.setBackgroundColor(mCtx.getResources().getColor(R.color.colorPrimary));
        } else {
            holder.scheduleContainer.setBackgroundColor(mCtx.getResources().getColor(R.color.colorPrimaryDark));
        }

        holder.scheduleText.setText(data[mDay][position]);
    }

    @Override
    public int getItemCount() {
        return data[mDay].length;
    }
}
