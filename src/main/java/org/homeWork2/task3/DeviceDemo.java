package org.homeWork2.task3;

import java.util.Scanner;

public class DeviceDemo {
    public static void main(String[] args) {

        int temperature1, temperature2;

        Device device = new Device();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите температуру первой колбы:");
        temperature1 = Integer.parseInt(scan.nextLine());
        System.out.println("Введите температуру второй колбы:");
        temperature2 = Integer.parseInt(scan.nextLine());


        device.IsWork(temperature1,temperature2);


    };


};
