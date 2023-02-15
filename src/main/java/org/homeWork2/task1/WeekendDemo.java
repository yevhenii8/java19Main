package org.homeWork2.task1;

import java.util.Scanner;

public class WeekendDemo {
    public static void main(String[] args) {

        Weekend weekend = new Weekend();
        Scanner scan = new Scanner(System.in);
        System.out.println("у вас выходной? " + "на улице дождь?");


        if (( weekend.isRain = weekend.isWeekend = Boolean.parseBoolean(scan.nextLine())) && (weekend.isRain == !Boolean.parseBoolean(scan.nextLine()))){

            weekend.canWalk = true;

        }else System.out.println("не идем гулять");

        if (weekend.canWalk == true){

            System.out.println("идем гулять");

        }




    }





}
