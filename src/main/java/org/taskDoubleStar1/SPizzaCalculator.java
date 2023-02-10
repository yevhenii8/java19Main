package org.taskDoubleStar1;

import org.task4.CalculatorTask;

public class SPizzaCalculator {


    public double D2(double d){

        CalculatorTask d2 = new CalculatorTask();
        return d2.umn(d,d);

    };

    public double AlmostS(double d2){

        CalculatorTask almostS = new CalculatorTask();
        return almostS.dell(d2,4);

    };


    public double SPizza(double almostS){

        CalculatorTask sPizza = new CalculatorTask();
        return sPizza.umn(almostS,3.14159);

    };


    public double CalPizza(double sPizza){

        CalculatorTask calPizza = new CalculatorTask();
        return calPizza.umn(sPizza,40);

    }


    public double ResaultMinus(double calPizza1, double calPizza2){

        CalculatorTask resault = new CalculatorTask();
        return resault.minus(calPizza1,calPizza2);

    }


}














