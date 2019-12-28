package com.example.earthquake;

public class Quake {

    private String mMagnitude;
    private  String mPlace;
    private  String mTime;
//creating a constructor which is taking three parameter as magnitude,place, and time.
    public Quake(String mag,String place,String time){
        mMagnitude=mag;
        mPlace=place;
        mTime=time;
    }

    public String getmMagnitude()
    {
        return mMagnitude;
    }
    public String getmPlace(){
        return mPlace;
    }
    public String getmTime(){
        return mTime;
    }




}
