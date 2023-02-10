package org.task4;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        double a,b,resoult;

        char znack;



        Scanner scan = new Scanner(System.in);

        CalculatorTask calculator1 = new CalculatorTask();



        while (true) {

            a = Double.parseDouble(scan.next());

            znack = scan.next().charAt(0);

            b = Double.parseDouble(scan.next());


            if (znack == '+') {

                resoult = calculator1.plus(a, b);
                System.out.println(resoult);


            } else if (znack == '-') {

                resoult = calculator1.minus(a, b);
                System.out.println(resoult);

            } else if (znack == '/') {

                resoult = calculator1.dell(a, b);
                System.out.println(resoult);

            } else if (znack == '*') {

                resoult = calculator1.umn(a, b);
                System.out.println(resoult);

            } else {

                System.out.println("введите +,-,/,*");

            }


        }






















    }

}
