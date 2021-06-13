package oop.assignment2.ex27;

public class Validator {

    /*
     *  UCF COP3330 Summer 2021 Assignment 2 Solution
     *  Copyright 2021 Drake Scott
     */

    public static boolean validateName(String name){
        if(name.equals("")){
            return false;
        }else
        if(name.length() < 2){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean validateZIP(String ZIP){
        char[] zipArray = ZIP.toCharArray();
        if(ZIP.length() != 5){
            return false;
        } else{
            for(int j = 0; j < 5; j++){
                if(!Character.isDigit(zipArray[j])){
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean validateID(String ID){
        char[] idArray = ID.toCharArray();
        if(idArray.length > 7){
            return false;
        }else
        if(!Character.isLetter(idArray[0]) || !Character.isLetter(idArray[1])){
            return false;
        }else
        if(idArray[2] != '-'){
            return false;
        }else{
            for(int i = 3; i <= 6; i++){
                if(!Character.isDigit(idArray[i])){
                    return false;
                }
            }
            return true;
        }

    }

}
