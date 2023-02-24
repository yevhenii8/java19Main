package org.homeWork3.task1;

public class GeneratorRandomTrue {
    public int Random(int max, int min){
        int randomResult = (int)(Math.random() * (max - min +1) + min);
        return randomResult;
    }
}
