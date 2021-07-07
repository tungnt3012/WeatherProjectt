package com.example.weatherprojectt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Hourly> mHourly;

    public HourlyAdapter(Context mContext, ArrayList<Hourly> mHourly) {
        this.mContext = mContext;
        this.mHourly = mHourly;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mtxtHour, mtxtTemperature, mtxtFeel, mtxtHumidity;

        public ViewHolder(View itemView) {
            super(itemView);
            mtxtHour = itemView.findViewById(R.id.txtHour);
            mtxtTemperature = itemView.findViewById(R.id.txtTemperature);
            mtxtFeel = itemView.findViewById(R.id.txtFeel);
            mtxtHumidity = itemView.findViewById(R.id.txtHumidity);
        }
    }

    @Override
    public HourlyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View hourlyView = inflater.inflate(R.layout.hourly_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(hourlyView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HourlyAdapter.ViewHolder holder, int position) {
        Hourly hourly = mHourly.get(position);
        holder.mtxtHour.setText(hourly.getmHour());
        holder.mtxtTemperature.setText(hourly.getmTemperature());
        holder.mtxtFeel.setText(hourly.getmFeel());
        holder.mtxtHumidity.setText(hourly.getmHumidity());
    }

    @Override
    public int getItemCount() {
        return mHourly.size();
    }
}
