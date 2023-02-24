package org.homeWork3.taskStar2;

import com.sun.source.tree.ReturnTree;
import org.homeWork3.task1.GeneratorRandomTrue;

public class Array30 {
    GeneratorRandomTrue generatorRandomTrue = new GeneratorRandomTrue();
    int[] randomArray = new int[30];
    int max = randomArray[0];
    int min;
    int arithmeticMean, arithmeticMeanSum, indexMin, indexMax, minMaxDifference, firstPrimeNumber, primeNumbers, lastPrimeNumber;

    public int[] Array() {
        System.out.print("ваш массив: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = generatorRandomTrue.Random(30, 1);
            System.out.print(randomArray[i] + " | ");
        }
        System.out.println();
        return randomArray;
    }

    public int ArrayMax() {
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
                indexMax = i;
            }
        }
        System.out.println("максимальное значение массива: " + max);
        return max;
    }

    public int ArrayMin() {
        min = randomArray[0];
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] < min) {
                min = randomArray[i];
                indexMin = i;
            }
        }
        System.out.println("минимальное значение массива: " + min);
        return min;
    }

    public int ArrayArithmeticMean() {
        for (int i = 0; i < randomArray.length; i++) {
            arithmeticMeanSum += randomArray[i];
        }
        arithmeticMean = arithmeticMeanSum / randomArray.length;
        System.out.println("среднее арифметическое: " + arithmeticMean);
        return arithmeticMean;
    }

    public int ArrayMinMaxDifference() {
        if (indexMax > indexMin) {
            minMaxDifference = indexMax - indexMin - 1;
        } else if (indexMax < indexMin) {
            minMaxDifference = indexMin - indexMax - 1;
        }
        System.out.println("количество элементов между максимальным и минимальным элементами: " + minMaxDifference);
        return minMaxDifference;
    }

    public int ArrayFirstPrimeNumber() {
        boolean flag = false;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] == 2) {
                firstPrimeNumber = randomArray[i];
                flag = true;
            }
            if (flag == true) {
                break;
            }
            for (int j = 2; j < randomArray[i]; j++) {
                if ((randomArray[i] % j) == 0) {
                    break;
                }
                if (j == randomArray[i] - 1) {
                    firstPrimeNumber = randomArray[i];
                }
                if (firstPrimeNumber == randomArray[i]) {
                    flag = true;
                }
            }
        }
        System.out.println("первое простое число: " + firstPrimeNumber);
        return firstPrimeNumber;
    }

    public int ArrayPrimeNumbers() {
        System.out.print("простые числа из вашего массива: ");
        int counter = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] == 2) {
                counter++;
                primeNumbers = randomArray[i];
                System.out.print(primeNumbers + " | ");
            }
            for (int j = 2; j < randomArray[i]; j++) {
                if ((randomArray[i] % j) == 0) {
                    break;
                }
                if (j == randomArray[i] - 1) {
                    counter++;
                    primeNumbers = randomArray[i];
                    System.out.print(primeNumbers + " | ");
                }
            }
        }
        System.out.println();
        System.out.println("количество простых чисел в массиве: " + counter);
        return primeNumbers;
    }
    public int ArrayLastPrimeNumber() {
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] == 2) {
                lastPrimeNumber = randomArray[i];
            }
            for (int j = 2; j < randomArray[i]; j++) {
                if ((randomArray[i] % j) == 0) {
                    break;
                }
                if (j == randomArray[i] - 1) {
                    lastPrimeNumber = randomArray[i];
                }
            }
        }
        System.out.println("последнее простое число: " + lastPrimeNumber);
        return lastPrimeNumber;
    }
}