package com.example.android.quakereport;

public class Earthquake {

    //Magnitude of the earthquake
    private double mMagnitute;

    //Location of the earthquake
    private String mLocation;

    // Time of the earthquake
    private long mTimeInMilliseconds;

    public Earthquake(double magnitute, String location, long timeInMilliseconds){
        mMagnitute = magnitute;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
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


}
