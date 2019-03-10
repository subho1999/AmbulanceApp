package com.subho.ambulanceapp;

import java.util.UUID;

public class Ambulance {
    private final UUID mID = UUID.randomUUID();
    private int mStatus;
    private int mDestinationX;
    private int mDestinationY;
    private int mCurrentX;
    private int mCurrentY;

    public UUID getID() {
        return mID;
    }

    public Ambulance(int status, int destinationX, int destinationY, int currentX, int currentY) {
        mStatus = status;
        mDestinationX = destinationX;
        mDestinationY = destinationY;
        mCurrentX = currentX;
        mCurrentY = currentY;
    }

    public void pickupPatient(int destinationX, int destinationY){
        mStatus = 1;
        mDestinationX = destinationX;
        mDestinationY = destinationY;
    }

    public void dropoffPatient(){
        mStatus = 0;
        mDestinationX = 0;
        mDestinationY = 0;
    }
}
