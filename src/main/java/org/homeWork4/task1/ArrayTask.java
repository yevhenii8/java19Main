package org.homeWork4.task1;

public class ArrayTask {
    public int ArrayFinder(SupperArray supperArray){
        int i;
        int [] newArray = supperArray.getArrayMinus1();
        for (i = 1; i < newArray.length ; i++) {
            if ((newArray [i] - newArray[i - 1]) == 2){
                int num = newArray[i - 1] + 1;
                return num;
            }
        }
        if (newArray[i - 1] == newArray.length + 1){
            return 1;
        }else {
            return newArray.length + 1;
        }
    }
}
