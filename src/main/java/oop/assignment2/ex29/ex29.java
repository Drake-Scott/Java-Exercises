package oop.assignment2.ex29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */


import java.util.Scanner;

public class ex29 {

    public static String userInput;
    public static InputCheck ic = new InputCheck();

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        RuleOf72 rule = new RuleOf72();
        readUserInput();
        double years = rule.calculateYears(userInput);
        String output = rule.returnOutput(years);
        System.out.println(output);

    }


    public static void readUserInput(){
        System.out.print("What is the rate of return?");
        userInput = input.nextLine();
        while(!ic.inputChecker(userInput)) {
            System.out.println("Sorry. That's not a valid input.");
            readUserInput();
        }
    }



}
