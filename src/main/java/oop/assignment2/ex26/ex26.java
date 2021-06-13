package oop.assignment2.ex26;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex26 {
    private static double n, apr, b, p, i;
    private static final Scanner input = new Scanner(System.in);
    private static DecimalFormat df = new DecimalFormat("#,###");

    public static void main(String[] args) {

        readUserInput();

        PaymentCalculator pc = new PaymentCalculator();
        n = pc.calculateMonthsUntilPaidOff(i, b, p);

        System.out.println("it will take you " + df.format(Math.ceil(n)) + " months to pay off this card.");
    }

    public static void readUserInput(){
        System.out.print("What is your balance? ");
        b = input.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = input.nextDouble();
        double aprPercent = apr / 100;
        i = (aprPercent / 365);

        System.out.print("What is the monthly payment you can make? ");
        p = input.nextDouble();

    }
}
