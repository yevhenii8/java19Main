package org.homeWork3.task2;

import org.homeWork3.task1.GeneratorRandomTrue;

public class Array5 {
    GeneratorRandomTrue randomTrue = new GeneratorRandomTrue();

    public int[] filterArray() {
        int[] randomNumbers5 = new int[5];
        for (int i = 0; i < randomNumbers5.length; i++) {
            randomNumbers5[i] = randomTrue.Random(99, 10);
            System.out.print(" " + randomNumbers5[i]);
        }
        boolean increases = true;
        for (int i = 1; i < randomNumbers5.length; i++) {
            if (randomNumbers5[i] <= randomNumbers5[i - 1]) {
                increases = false;
                break;
            }
        }
            if (increases) {
                System.out.println(" - массив являеться строго возрастающей последовательностью");
            } else {
                System.out.println(" - массив не являеться строго возрастающей последовательностью");
            }

            return randomNumbers5;

    }
}