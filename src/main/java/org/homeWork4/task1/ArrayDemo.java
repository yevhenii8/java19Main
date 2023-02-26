package org.homeWork4.task1;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] newArrayMinus1;
        ArrayTask arrayTask = new ArrayTask();
        SupperArray supperArray = new SupperArray();
        newArrayMinus1 = UserInput.UserInputMethod();
        supperArray.setArrayMinus1(newArrayMinus1);
        int num = arrayTask.ArrayFinder(supperArray);
        System.out.println("недостающее число: " + num);
    }
}
