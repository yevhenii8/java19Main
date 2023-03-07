package org.homeWork5.task1;

public class Random {

    static int  randomGenerate (){
        int max = 50;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }

}
