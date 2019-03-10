package com.subho.ambulanceapp;

import java.util.UUID;

public class Ambulance {
    private int mStatus;
    private double mDestinationX;
    private double mDestinationY;
    private double mCurrentX;
    private double mCurrentY;

    public double getDestinationX() {
        return mDestinationX;
    }

    public double getDestinationY() {
        return mDestinationY;
    }

    public double getCurrentX() {
        return mCurrentX;
    }

    public double getCurrentY() {
        return mCurrentY;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int status) {
        mStatus = status;
    }

    public void setDestinationX(double destinationX) {
        mDestinationX = destinationX;
    }

    public void setDestinationY(double destinationY) {
        mDestinationY = destinationY;
    }

    public Ambulance(){

    }

    public Ambulance(int status, double destinationX, double destinationY, double currentX, double currentY) {
        mStatus = status;
        mDestinationX = destinationX;
        mDestinationY = destinationY;
        mCurrentX = currentX;
        mCurrentY = currentY;
    }

    public void pickupPatient(double destinationX, double destinationY){
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
