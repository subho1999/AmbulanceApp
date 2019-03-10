package com.subho.ambulanceapp;

import java.util.List;
import java.util.UUID;

public class Hospital {
    private final UUID mID = UUID.randomUUID();
    private int mHomeX;
    private int mHomeY;
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

    public void createAmbulanceList(){
        for (int i = 0; i < 5; i++) {
            mAmbulanceList.add(new Ambulance(0,0,0,mHomeX,mHomeY));
        }
    }
}
