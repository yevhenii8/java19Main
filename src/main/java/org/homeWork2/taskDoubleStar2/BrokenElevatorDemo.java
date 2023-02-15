package org.homeWork2.taskDoubleStar2;

import org.homeWork2.taskDoubleStar2.UserOutput;

public class BrokenElevatorDemo {
    public static void main(String[] args) {
        int floor,stepUp,stepDown,upNumber;


        BrokenElevator brokenElevator = new BrokenElevator();
        UserInput userInput = new UserInput();
        UserOutput userOutput = new UserOutput();


        floor = userInput.Input("введите количество этажей: ");
        stepUp = userInput.Input("введите на сколько поднимаеться лифт за цикл: ");
        stepDown = userInput.Input("введите на сколько опускаеться лифт за цикл: ");
        upNumber = brokenElevator.NumberOfLifts(floor,stepUp,stepDown);

        userOutput.Print(upNumber);













    }





}
