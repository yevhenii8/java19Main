package org.homeWork2.task3;

public class Device {
    boolean isWork;

    public void IsWork(int temperature1, int temperature2) {

        if ((temperature1 > 100) && (temperature2 < 100)) {

            isWork = true;
        } else {
            isWork = false;
        }
        System.out.println("Устройство работает коректно -" + isWork);
    }
}