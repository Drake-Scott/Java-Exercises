package oop.assignment2.ex28;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex28 {

    public static void main(String[] args) {

    IterativeAddition ia = new IterativeAddition();

    int sum = ia.iterateInput(5);

    printOutput(sum);

    }

    private static void printOutput(int sum) {
        String output = "The total is " + sum + ".";
        System.out.println(output);
    }

}
