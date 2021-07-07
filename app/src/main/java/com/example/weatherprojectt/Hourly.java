package com.example.weatherprojectt;

public class Hourly {
    private String mHour;
    private String mTemperature;
    private String mFeel;
    private String mHumidity;

    public Hourly(String mHour, String mTemperature, String mFeel, String mHumidity) {
        this.mHour = mHour;
        this.mTemperature = mTemperature;
        this.mFeel = mFeel;
        this.mHumidity = mHumidity;
    }

    public String getmHour() {
        return mHour;
    }

    public void setmHour(String mHour) {
        this.mHour = mHour;
    }

    public String getmTemperature() {
        return mTemperature;
    }

    public void setmTemperature(String mTemperature) {
        this.mTemperature = mTemperature;
    }

    public String getmFeel() {
        return mFeel;
    }

    public void setmFeel(String mFeel) {
        this.mFeel = mFeel;
    }

    public String getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(String mHumidity) {
        this.mHumidity = mHumidity;
    }
}
