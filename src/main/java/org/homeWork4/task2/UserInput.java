package org.homeWork4.task2;

import java.util.Scanner;

public class UserInput {
   public int n;
   public int k;
   public int [] nArray;
    Scanner scan = new Scanner(System.in);

    public UserInput() {
        UserInputMethod();
    }

    public void UserInputMethod (){
        System.out.print("введите длинну массива: ");
        n = Integer.parseInt(scan.nextLine());
        System.out.print("введите значение для K: ");
        k = Integer.parseInt(scan.nextLine());
        nArray = new int[n];
        for (int i = 0; i < nArray.length; i++) {
            System.out.print("введите значение " + i + " -ого элемента массива: ");
            nArray[i] = Integer.parseInt(scan.nextLine());
        }
    }
}
