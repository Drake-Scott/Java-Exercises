package oop.assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_correctly() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean expected = true;
        boolean actual = detector.isAnagram("note", "note");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_uppercase() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean expected = true;
        boolean actual = detector.isAnagram("NOTE", "note");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_difflength() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("note", "not");

        //then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_diffletter() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("note", "wxyz");

        //then
        assertFalse(actual);
    }
}