package oop.assignment2.ex32;
import java.util.Random;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class RandomNumGen {

    public static int generateNum(int difficulty){
        Random rand = new Random();
        int randomNum = 0;

        switch (difficulty){
            case 1:
                randomNum = rand.nextInt(9) + 1;
                break;
            case 2:
                randomNum = rand.nextInt(99) + 1;
                break;
            case 3:
                randomNum = rand.nextInt(999) + 1;
                break;
            default:
                break;
        }

        return randomNum;

    }
}
