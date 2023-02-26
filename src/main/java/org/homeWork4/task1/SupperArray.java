package org.homeWork4.task1;

public class SupperArray {
    private int[] arrayMinus1;

    public int[] getArrayMinus1() {
        return arrayMinus1;
    }

    public void setArrayMinus1(int[] arrayMinus1) {
        this.arrayMinus1 = arrayMinus1;
        BubbleSort();
    }
    public void BubbleSort(){
        for (int j = 0; j < arrayMinus1.length; j++) {
            for (int i = 1; i < arrayMinus1.length; i++) {
                if (arrayMinus1[i] < arrayMinus1[i - 1]){
                    int buff = arrayMinus1[i];
                    arrayMinus1[i] = arrayMinus1[i - 1];
                    arrayMinus1[i - 1] = buff;
                }
            }
        }
    }
}
