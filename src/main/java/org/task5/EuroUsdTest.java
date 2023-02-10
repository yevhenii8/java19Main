package org.task5;

import java.util.Scanner;

public class EuroUsdTest {

    public static void main(String[] args) {

        double e,courseEU,resault;

        EuroUsdTask euroUsd = new EuroUsdTask();

        Scanner scan = new Scanner(System.in);


        System.out.println("Введите сумму в евро: ");
       e = Double.parseDouble(scan.nextLine());


        System.out.println("Введите актуальній курс: ");
       courseEU = Double.parseDouble(scan.nextLine());


       resault = euroUsd.converter(e,courseEU);
        System.out.println("Сколько долларов ві получите " + Math.round(resault * 100)/ 100d + '$');
















    }




}
