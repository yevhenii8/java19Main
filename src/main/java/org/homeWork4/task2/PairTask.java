package org.homeWork4.task2;

public class PairTask {
    public int PairFinder (int k, int [] nArray){
        int counter = 0;
        for (int i = 0; i < nArray.length; i++) {
            for (int j = i + 1; j < nArray.length; j++) {
                if ((nArray[i] + nArray[j]) == k){
                    counter++;
                }
            }
        }
        return counter;
    }
}
