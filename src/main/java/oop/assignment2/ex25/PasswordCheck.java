package oop.assignment2.ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class PasswordCheck {

    public static int passwordValidator(String password){
        //0 = very weak, 1 = weak, 2 = avg, 3 = above avg, 4 = strong, 5 = very strong
        int letterCount = 0, numCount = 0, n = password.length();

        if(n < 8){                  //check how long password is.

            for(int i = 0; i < password.length(); i++){
                if (Character.isDigit(password.charAt(i))){
                    numCount++;
                } else {
                    letterCount++;
                }
            }
            if(numCount == n){
                return 0;
            }
            else
            if(numCount < n){
                return 1;
            }

        }
        else {
            for(int j = 0; j < n; j++){
                if (Character.isLetterOrDigit(password.charAt(j)) == false){
                    return 5;
                } else
                if (Character.isLetter(password.charAt(j))){
                    letterCount++;
                } else
                if (Character.isDigit(password.charAt(j))){
                    numCount++;
                }
            }
            if(numCount == n){
                return 2;
            } else
            if(letterCount == n){
                return 3;
            }
            else{
                return 4;
            }
        }
        // < 8, all numbers very weak, all letters or letters + numbers, weak.
        // >= 8, all numbers is average, >= 8 all letters is above average.
        // >= 8, letters + at least 1 number = strong
        // >= 8, letters, numbers, special char = very strong
        return 0;
    }
}
