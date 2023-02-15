package org.homeWork2.task2;

import java.util.Scanner;

public class ShopsDemo {
    public static void main(String[] args) {

        Shops shops = new Shops();
        Scanner scan = new Scanner(System.in);


        System.out.println("Открыта ли Edeka?");
        shops.isEdekaOpen = Boolean.parseBoolean(scan.nextLine());
        System.out.println("Открыт ли Rewe?");
        shops.isReweOpen = Boolean.parseBoolean(scan.nextLine());
        if ((shops.isEdekaOpen) || (shops.isReweOpen)) {
            shops.canBuy = true;
            System.out.println(shops.CanBuy());



        }else System.out.println(shops.CanBuy());



    };



};
