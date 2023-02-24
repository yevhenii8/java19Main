package org.homeWork3.task1;

public class Array8 {
GeneratorRandomTrue randomTrue = new GeneratorRandomTrue();
    public int[] filterArray() {
        int[] randomNumbers8 = new int[8];
        for (int i = 0; i < randomNumbers8.length; i++) {
            randomNumbers8[i] = randomTrue.Random(50,1);
            System.out.print(" " + randomNumbers8[i]);
        }
        System.out.println();
        System.out.println("-------------------------------");
        for (int i = 0; i < randomNumbers8.length; i++) {
            if ((i % 2 != 0)){
                randomNumbers8[i] = 0;
            }
            System.out.print(" " + randomNumbers8[i]);
        }
        return randomNumbers8;
    }
}