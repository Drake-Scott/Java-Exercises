package oop.assignment2.ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class HeartRate {

    public static int findHeartRate(double intensity, int pulse, int age){
        int target = (int) ((((220 - age) - pulse) * intensity) + pulse);
        return target;
    }

    public static int[] bpmFiller(int pulse, int age){
        int[] bpmArr = new int[9];
        int i = 0;
        double intensity = 0.55;
        while(intensity < 1){
            bpmArr[i] = findHeartRate(intensity, pulse, age);
            intensity = intensity + 0.05;
            i++;
        }
        return bpmArr;
    }
}

