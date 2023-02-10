package org.task3;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        ScannerTask scanner1 = new ScannerTask();

        Scanner scan = new Scanner(System.in);

        scanner1.word1 = scan.nextLine();
        scanner1.word2 = scan.nextLine();



        if(scanner1.word1.length() %2 == 1 || scanner1.word2.length() %2 == 1){

            System.out.println("не четное число");

            return;

        }



        System.out.println(scanner1.word1 + " " + scanner1.word2);



        System.out.println(scanner1.word1.length() + " " + scanner1.word2.length());



        int length1 = scanner1.word1.length();

        System.out.println(scanner1.word1.substring(0, length1 /2 ));

        String wo1 = scanner1.word1.substring(0, length1 /2 );




        int length2 = scanner1.word2.length();

        System.out.println(scanner1.word2.substring(length2 /2,length2));

        String rd2 = scanner1.word2.substring(length2 /2,length2);


        System.out.println(wo1 + rd2);





















    }





}
