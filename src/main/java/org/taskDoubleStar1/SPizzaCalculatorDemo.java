package org.taskDoubleStar1;

import org.task4.CalculatorTask;

import java.util.Scanner;

public class SPizzaCalculatorDemo {
    public static void main(String[] args) {


        SPizzaCalculator Pizza1 = new SPizzaCalculator();
        SPizzaCalculator Pizza2 = new SPizzaCalculator();
        SPizzaCalculator ResaultMinusEx = new SPizzaCalculator();
        Scanner scan = new Scanner(System.in);


        double newResault,calPizza1,calPizza2,sPizza1,sPizza2,almostS1,almostS2,dp12,dp22,dp1,dp2;


        System.out.println("Введите диаметр перовой пицци:");
       dp1 = Double.parseDouble(scan.nextLine());
        System.out.println("Введите диаметр второй пицци:");
       dp2 = Double.parseDouble(scan.nextLine());


        dp12 = Pizza1.D2(dp1);
        almostS1 = Pizza1.AlmostS(dp12);
        sPizza1 = Pizza1.SPizza(almostS1);
        calPizza1 = Pizza1.CalPizza(sPizza1);

        dp22 = Pizza2.D2(dp2);
        almostS2 = Pizza2.AlmostS(dp22);
        sPizza2 = Pizza2.SPizza(almostS2);
        calPizza2 = Pizza2.CalPizza(sPizza2);

        newResault = ResaultMinusEx.ResaultMinus(calPizza2,calPizza1);

        System.out.println("Разница каллорий: " + Math.round(newResault *100)/100 + " Cal");
















    }




}
