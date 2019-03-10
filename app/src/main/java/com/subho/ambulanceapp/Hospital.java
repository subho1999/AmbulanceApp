package com.subho.ambulanceapp;

import java.util.List;
import java.util.UUID;

public class Hospital {
    private final UUID mID = UUID.randomUUID();
    private double mHomeX;
    private double mHomeY;
    private int mNumAmbulance = 5;
    private List<Ambulance> mAmbulanceList;

    public UUID getID() {
        return mID;
    }

    public List<Ambulance> getAmbulanceList() {
        return mAmbulanceList;
    }

    public void setAmbulanceList(List<Ambulance> ambulanceList) {
        mAmbulanceList = ambulanceList;
    }

    public Hospital() {
        mHomeX = Math.random()*360;
        mHomeY = Math.random()*360;
        createAmbulanceList();
    }

    private void createAmbulanceList(){
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
    }
}
