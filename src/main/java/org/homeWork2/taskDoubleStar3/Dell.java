package org.homeWork2.taskDoubleStar3;

public class Dell {
    public int MoneyDay(int newN) {
        int dell, moneyInDay = 0;
        for (dell = 1; dell < newN; dell++) {
            if ((newN % dell) == 0) {
                moneyInDay = dell;
            }
        }
        return moneyInDay;
    }
}