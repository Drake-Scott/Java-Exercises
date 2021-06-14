package oop.assignment2.ex33;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class Options {
    public static String answer(int randNum){
        String output;
        switch (randNum){
            case 0:
                output = "Yes.";
                break;
            case 1:
                output = "No.";
                break;
            case 2:
                output = "Maybe.";
                break;
            case 3:
                output = "Ask again later.";
                break;
            default:
                output = "";
                break;
        }
        return output;
    }
}
