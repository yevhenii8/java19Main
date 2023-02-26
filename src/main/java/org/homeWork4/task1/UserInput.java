package org.homeWork4.task1;

import java.util.Scanner;

public class UserInput {
   static Scanner scan = new Scanner(System.in);

    public static int [] UserInputMethod(){
        System.out.print("введите значение n: ");
        int n = Integer.parseInt(scan.nextLine());
        int [] arrayMinus1 = new int[n - 1];
        for (int i = 0; i < arrayMinus1.length; i++) {
            System.out.print("введите значение " + i + " -ого элемента массива: ");
            arrayMinus1[i] = Integer.parseInt(scan.nextLine());
        }
        return arrayMinus1;
    }
}
