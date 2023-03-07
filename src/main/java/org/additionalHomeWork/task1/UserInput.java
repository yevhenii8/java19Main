package org.additionalHomeWork.task1;

import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);

    public static String UI (){
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        return word;
    }
}
