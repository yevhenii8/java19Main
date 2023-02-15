package org.homeWork2.taskDoubleStar2;

import java.util.Scanner;

public class UserInput {

    Scanner scan = new Scanner(System.in);

    public int Input(String message){
        int input;

        System.out.println(message);
        input = Integer.parseInt(scan.nextLine());

        return input;

    }








}
