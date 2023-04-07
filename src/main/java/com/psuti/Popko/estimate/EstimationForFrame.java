package com.psuti.Popko.estimate;

public class EstimationForFrame {
    int sExtWall, sIntWall, pIntWall, floorHeight,
            amountFloor, pExtWall, baseArea, internalWallLength,
            internalWallThickness, overlapThickness,
            numberPlankExtRack, numberPlankBase, numberPlankFrame, numberPlankAll,
            pFrame,amountFrame;
    double externalWallThickness;

    public int getsExtWall(int amountFloor, int floorHeight, int pExtWall) {
        return sExtWall += amountFloor * floorHeight * pExtWall;
    }

    public int getsIntWall(int internalWallLength, int floorHeight, int amountFloor) {
        return sIntWall += internalWallLength * floorHeight * amountFloor;
    }

    public int getNumberPlank(int pExtWall){
        return numberPlankExtRack = (int) Math.floor(pExtWall/0.6+1);
    }

    public int getNumberPlankBase(int pExtWall) {
        return numberPlankBase=pExtWall*2/3;
    }

    public int getNumberPlankFrame(int pFrame,int amountFrame) {
        return numberPlankFrame=pFrame*amountFrame/3;
    }

    public int getNumberPlankAll(int pExtWall, int pFrame, int amountFrame) {
        return getNumberPlank(pExtWall)+getNumberPlankBase(pExtWall)+getNumberPlankFrame(pFrame,amountFrame);
    }


}
