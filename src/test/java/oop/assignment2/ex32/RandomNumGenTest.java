package oop.assignment2.ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

class RandomNumGenTest {
    public static RandomNumGen r = new RandomNumGen();

    @Test
    void generateEasy() {
        int actual = r.generateNum(1);
        assertTrue(1 <= actual && actual <= 10);
    }

    @Test
    void generateMed() {
        int actual = r.generateNum(2);
        assertTrue(1 <= actual && actual <= 100);
    }

    @Test
    void generateHard() {
        int actual = r.generateNum(3);
        assertTrue(1 <= actual && actual <= 1000);
    }

    @Test
    void generateWhack() {
        int actual = r.generateNum(90);
        assertFalse(1 <= actual && actual <= 1000);
    }
}