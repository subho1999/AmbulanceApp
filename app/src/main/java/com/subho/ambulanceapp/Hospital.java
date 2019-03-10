package com.subho.ambulanceapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Hospital {
    private double mHomeX;
    private double mHomeY;
    //private int mNumAmbulance = 5;
    //private ArrayList<Ambulance> mAmbulanceList;
    private Ambulance mA1;

    /*public ArrayList<Ambulance> getAmbulanceList() {
        return mAmbulanceList;
    }

    public void setAmbulanceList(ArrayList<Ambulance> ambulanceList) {
        mAmbulanceList = ambulanceList;
    }*/
    public Hospital(){

    }

    public Hospital(double homeX, double homeY) {
        mHomeX = homeX;
        mHomeY = homeY;
        mA1 = new Ambulance(0,0.0,0.0,mHomeX,mHomeY);
    }

    public double getHomeX() {
        return mHomeX;
    }

    public double getHomeY() {
        return mHomeY;
    }
/*private void createAmbulanceList(){
        for (int i = 0; i < mNumAmbulance; i++) {
            mAmbulanceList.add(new Ambulance(0,0,0,mHomeX,mHomeY));
        }
    }

    public void sendAmbulance(double destX, double destY){
        boolean flag = false;
        for (int i = 0; i < mNumAmbulance; i++) {
            if(mAmbulanceList.get(i).getStatus() == 0){
                mAmbulanceList.get(i).setStatus(1);
                mAmbulanceList.get(i).setDestinationX(destX);
                mAmbulanceList.get(i).setDestinationY(destY);
                flag = true;
                break;
            }
        }

        if(!flag){
            //Implement after implementing dropoff function
        }
    }*/
    /*public void sendAmbulance(double destX, double destY){
        if(mA1.getStatus() == 0){
            mA1.setStatus(1);
            mA1.setDestinationX(destX);
            mA1.setDestinationY(destY);
        }
    }*/

}
