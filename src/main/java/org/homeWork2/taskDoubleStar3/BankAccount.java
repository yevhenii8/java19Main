package org.homeWork2.taskDoubleStar3;

public class BankAccount {

    Dell dell = new Dell();

    public int BreakBank(int n) {
        int newN,getMoney = 0,moneyInDay1,days;
        for (days = 0;getMoney < n;days ++) {
            newN = n - getMoney;
            moneyInDay1  = dell.MoneyDay(newN);
            getMoney = getMoney + moneyInDay1;
            if(newN <= 1){
                getMoney = getMoney + 1;
            }
        }
        return days;
    }

}