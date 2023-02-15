package org.homeWork2.taskDoubleStar3;

import org.homeWork2.taskDoubleStar3.UserInput;

public class BankAccountDemo {
    public static void main(String[] args) {

        int days,n;


        BankAccount bankAccount = new BankAccount();
        UserInput userInput = new UserInput();
        UserOutput userOutput = new UserOutput();


        n = userInput.Input("сколько долларов на вашем счету?");
        days = bankAccount.BreakBank(n);


        userOutput.Print(days);






    }
}
