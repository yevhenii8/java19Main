package org.seaBattle;

import java.sql.SQLOutput;

public class BattleField {

    public void yourBattleField (){
        String letters = ("    A  B  C  D  E  F  G  H  I  J");
        System.out.println(letters);
        int[][] yourBattleField = new int[10][10];
        for (int i = 0; i < yourBattleField.length; i++) {
            if ((i + 1) != 10){
                System.out.print((i + 1) + "  |");
            }else {
                System.out.print((i + 1) + " |");
            }
            for (int j = 0; j < yourBattleField[i].length; j++) {
                System.out.print(yourBattleField[i][j] + " |");
            }
            System.out.println();
        }
    }
}
