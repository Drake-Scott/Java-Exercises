/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment2.ex29;



public class RuleOf72 {

    public static double calculateYears(String rate){
        double r = Double.parseDouble(rate);
        double years = (72 / r);
        return years;
    }

    public static String returnOutput(double years){
        String output = "It will take " + years + " years to double your initial investment.";
        return output;
    }

}
