package com.example.weatherprojectt;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HourlyActivity extends AppCompatActivity {

    private ArrayList<Hourly> mHourly;
    private RecyclerView mRecyclerHourly;
    private HourlyAdapter mHourlyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hourly_activity);
        mRecyclerHourly = findViewById(R.id.hourlyForecastRV);
        mHourly = new ArrayList<>();
        createHourlyList();
        mHourlyAdapter = new HourlyAdapter(this,mHourly);
        mRecyclerHourly.setAdapter(mHourlyAdapter);
        mRecyclerHourly.setLayoutManager(new LinearLayoutManager(this));
    }

    private void createHourlyList() {
        mHourly.add(new Hourly("11:00","32","RealFeel39*","20"));
        mHourly.add(new Hourly("11:00","32","RealFeel39*","20"));
        mHourly.add(new Hourly("11:00","32","RealFeel39*","20"));
        mHourly.add(new Hourly("11:00","32","RealFeel39*","20"));
        mHourly.add(new Hourly("11:00","32","RealFeel39*","20"));
        mHourly.add(new Hourly("11:00","32","RealFeel39*","20"));

    }
}
