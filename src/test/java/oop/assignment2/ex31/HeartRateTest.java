package oop.assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

class HeartRateTest {
    public static HeartRate hr = new HeartRate();

    @Test
    void findHeartRate() {
        int actual = hr.findHeartRate(0.55,65,22);
        assertEquals(138,actual);
    }

    @Test
    void findHeartRate2() {
        int actual = hr.findHeartRate(0.95,65,22);
        assertEquals(191,actual);
    }
}