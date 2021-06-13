package oop.assignment2.ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double i, double b, double p){

        double power = Math.pow((1 + i), 30);       //break up formula into digestible parts
        double x = 1 + b/p * (1 - power);
        double n = -(1.0/30.0) * Math.log(x) / Math.log(1 + i);
        return n;

    }
}
