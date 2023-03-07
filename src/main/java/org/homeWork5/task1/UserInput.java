package org.homeWork5.task1;

import java.util.Scanner;

public class UserInput {
    public static int[] InputNumbers (){
        Scanner scanner = new Scanner(System.in);
        int[] inputNumbers = new int[5];
        for (int i = 0; i < inputNumbers.length; i++) {
            System.out.print("введите " + (i + 1) + " -ое число в диапазоне от 1 до 50: ");
            inputNumbers[i] = Integer.parseInt(scanner.nextLine());
            if (inputNumbers[i] < 1 || inputNumbers[i] > 50){
                i--;
                System.out.println("попробуй еще разок");
            }
        }
        return inputNumbers;
    }
}
