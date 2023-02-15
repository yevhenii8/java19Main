package org.homeWork2.taskDoubleStar3;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);
    public int Input(String message){
        int n;

        System.out.println(message);
        n = Integer.parseInt(scan.nextLine());
        return n;

    }




}
