package org.homeWork2.taskDoubleStar2;

public class BrokenElevator {


    public int NumberOfLifts(int floor, int stepUp, int stepDown) {
        int floorNumber = 0, trueUp = stepUp - stepDown, upNumber;
        for (upNumber = 0; floorNumber < floor; upNumber++) {

            floorNumber = floorNumber + trueUp;

        }

        return upNumber;

    }
}