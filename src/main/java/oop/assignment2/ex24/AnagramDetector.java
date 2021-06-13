package oop.assignment2.ex24;
import java.util.Arrays;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class AnagramDetector {

    public static boolean isAnagram(String s1, String s2){

        s1 = s1.toLowerCase();                      //convert the string to be all lowercase
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length()) {            //diff length, return false.
            return false;
        }

        char[] arr1 = s1.toCharArray();             //convert the strings to character arrays.
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);                          //sort both alphabetically.
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);           //return boolean value using Array.equals.

    }

}

