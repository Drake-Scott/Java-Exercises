package oop.assignment2.ex33;

import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

class OptionsTest {

    public static Options o = new Options();

    @Test
    void answer1() {
        String actual = o.answer(0);
        assertTrue(actual.equals("Yes."));
    }
    @Test
    void answer2() {
        String actual = o.answer(1);
        assertTrue(actual.equals("No."));
    }
    @Test
    void answer3() {
        String actual = o.answer(2);
        assertTrue(actual.equals("Maybe."));
    }
    @Test
    void answer4() {
        String actual = o.answer(3);
        assertTrue(actual.equals("Ask again later."));
    }
}