package com.example.android.quakereport;

public class Earthquake {

    //Magnitude of the earthquake
    private String mMagnitute;

    //Location of the earthquake
    private String mLocation;

    //Date of the earthquake
    private String mDate;

    public Earthquake(String magnitute, String location, String date){
        mMagnitute = magnitute;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitute() {
        return mMagnitute;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }


}
