package oop.assignment2.ex33;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

class ex33Test {

    @Test
    void giveAnswer() {
        Random rand = new Random();
        int i;
        int[] randArr = new int[50];
        for(i = 0 ; i < 50 ; i++){
            randArr[i] =  rand.nextInt(4);
        }
        for(i = 0 ; i < 50 ; i++){
            assertTrue(randArr[i] <= 3 && randArr[i] >= 0);
        }
    }
}