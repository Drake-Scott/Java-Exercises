package oop.assignment2.ex28;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class IterativeAddition {

    private static final Scanner input = new Scanner(System.in);

    public static int iterateInput(int n){
        int total = 0;
        for(int i = 1; i <= n; i++ ){
            System.out.print("Enter a number: ");
            total += input.nextDouble();
        }
        return total;
    }
}
