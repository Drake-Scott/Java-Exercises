package oop.assignment2.ex32;
import java.util.Scanner;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex32 {

    private static final Scanner input = new Scanner(System.in);
    public static int numGuess, difficulty, guess;

    public static void main(String[] args) {

        String runItBack = "y";
        System.out.println("Let's play Guess the Number!\n");
        while(runItBack.equals("y") || runItBack.equals("Y")) {
            RandomNumGen r = new RandomNumGen();
            numGuess = 0;
            readUserInput();
            int randomNum = r.generateNum(difficulty);
            guessing(randomNum);
            System.out.print("Do you wish to play again (y/n)? ");
            runItBack = input.next();
        }

    }

    public static void readUserInput(){
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        difficulty = numericInputOnlyDifficulty();
        while(3 < difficulty || 1 > difficulty){
            System.out.print("Invalid input, please enter a number: ");
            difficulty = input.nextInt();
        }
    }

    public static void guessing(int randomNum){
        String output;
        System.out.print("I have my number. What's your guess? ");
        guess = numericInputOnly();
        if (guess == randomNum) {
            numGuess++;
            System.out.println("You got it in " + numGuess + " guesses!");
        }else
        while(true){
            if(guess < randomNum){
                numGuess++;
                System.out.print("Too low. Guess again: ");
                guess = numericInputOnly();
           }else
           if(guess > randomNum){
                numGuess++;
                System.out.print("Too High. Guess again: ");
                guess = numericInputOnly();
           } else{
               numGuess++;
               System.out.println("You got it in " + numGuess + " guesses!");
               break;
           }
        }
    }

    public static int numericInputOnly(){
        while(true){
            try {
                return Integer.parseInt(input.nextLine());
            }
            catch(NumberFormatException e){
                System.out.print("Invalid input, please enter a number: ");
                numGuess++;
            }
        }
    }

    public static int numericInputOnlyDifficulty(){
        while(true){
            try {
                return Integer.parseInt(input.nextLine());
            }
            catch(NumberFormatException e){
                System.out.print("Invalid input, please enter a number: ");
            }
        }
    }

}
