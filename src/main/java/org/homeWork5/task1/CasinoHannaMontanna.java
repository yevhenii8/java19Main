package org.homeWork5.task1;

import org.homeWork2.taskDoubleStar2.UserOutput;

public class CasinoHannaMontanna {
    int[] inputNumbers = new int[5];
    public int[] WinsNumbers (){
        int[] winsNumbers = new int[5];
        for (int i = 0; i < winsNumbers.length; i++) {
            winsNumbers[i] = Random.randomGenerate();
        }
        return winsNumbers;
    }
    public void CompareNumbers (){
        boolean flag = false;
        int[] winsNumbers = WinsNumbers();
        inputNumbers = UserInput.InputNumbers();
        System.out.print("выиграшные числа: ");
        for (int i = 0; i < winsNumbers.length; i++) {
            for (int j = 0; j < inputNumbers.length; j++) {
                if (winsNumbers[i] == inputNumbers[j]){
                    flag = true;
                    System.out.print(inputNumbers[j] + " ");
                }
            }
        }
        if (flag == false){
            System.out.println("вы не выиграли нихерище");
        }
    }
}
