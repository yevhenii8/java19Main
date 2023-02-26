package org.homeWork4.task2;

import org.homeWork4.task2.UserInput;

public class PairDemo {
    public static void main(String[] args) {
        int counter;
        PairTask pairTask = new PairTask();
        UserInput userInput = new UserInput();
        counter = pairTask.PairFinder(userInput.k, userInput.nArray);
        System.out.println("количество пар элементов в массиве, сумма которых равна " + userInput.k + ": " + counter);
    }
}
