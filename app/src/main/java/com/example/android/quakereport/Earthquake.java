package com.example.android.quakereport;

public class Earthquake {

    //Magnitude of the earthquake
    private double mMagnitute;

    //Location of the earthquake
    private String mLocation;

    // Time of the earthquake
    private long mTimeInMilliseconds;

    // Website URL of the earthquake
    private String mUrl;

    public Earthquake(double magnitute, String location, long timeInMilliseconds, String url){
        mMagnitute = magnitute;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitute() {
        return mMagnitute;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }


}
