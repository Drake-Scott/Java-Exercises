/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

package oop.assignment2.ex29;

public class InputCheck {
    //do not allow user to enter 0, do not allow non numeric values.

    public static boolean inputChecker(String input){
        if(input.equals("0")){
            return false;
        }
        char[] array = input.toCharArray();
        int i = 0;
        while(i < input.length()){
            if(!Character.isDigit(array[i])){
                return false;
            }
            i++;
        }
        return true;
    }

}
