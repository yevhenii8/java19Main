package org.homeWork2.taskDoubleStar1;

import org.homeWork2.task3.Device;

public class Devise {
UserOutput userOutput = new UserOutput();
    public void Calculate(int s){
        int h,AlmostM,sec,m;
        AlmostM = s / 60;
        sec = s % 60;
        h = AlmostM / 60;
        m = AlmostM % 60;

        userOutput.Print(h,m,sec,s);
    }






}
