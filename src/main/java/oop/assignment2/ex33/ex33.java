package oop.assignment2.ex33;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex33 {

    private static final Scanner input = new Scanner(System.in);
    public static Options o = new Options();

    public static void main(String[] args) {

        readUserInput();

        giveAnswer();

    }

    public static void readUserInput(){

        System.out.print("What's your question?\n>");
        String question = input.nextLine();

    }

    public static void giveAnswer(){
        Random rand = new Random();
        int randNum =  rand.nextInt(4);
        System.out.println(o.answer(randNum));
    }
}
