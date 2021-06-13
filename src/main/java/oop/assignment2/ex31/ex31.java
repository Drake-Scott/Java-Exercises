package oop.assignment2.ex31;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex31 {

    public static int pulse, age;
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        HeartRate hr = new HeartRate();
        readUserInput();

        int[] bpm = hr.bpmFiller(pulse, age);
        printAll(bpm);

    }

    public static void readUserInput(){
        System.out.print("What is your resting pulse? ");
        pulse = numericInputOnly();

        System.out.print("How old are you? ");
        age = numericInputOnly();
    }

    public static int numericInputOnly(){
        while(true){
            try {
                return Integer.parseInt(input.nextLine());
            }
            catch(NumberFormatException e){
                System.out.print("Invalid input, please enter a number: ");
            }
        }
    }

    public static void printAll(int[] bpm){
        System.out.println("Resting Pulse: " + pulse + "\tAge: " + age);
        System.out.println("Intensity\t|\tRate");
        System.out.println("------------------------");
        int j = 0;
        for(int i = 55; i < 96; i = i+5){
                System.out.println(i + "%\t\t\t|\t" + bpm[j] + "bpm");
                j++;
        }
    }

}
