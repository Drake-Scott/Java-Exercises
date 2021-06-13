package oop.assignment2.ex27;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

class ValidatorTest {

    // The following tests are for the ID validator.

    private static Validator v = new Validator();
    @Test
    void correctID() {
        boolean actual = v.validateID("AA-1234");
        assertTrue(actual);
    }
    @Test
    void badID1() {
        boolean actual = v.validateID("AAa1234");
        assertFalse(actual);
    }
    @Test
    void badID2() {
        boolean actual = v.validateID("A12-1234");
        assertFalse(actual);
    }
    @Test
    void badID3() {
        boolean actual = v.validateID("12-7777");
        assertFalse(actual);
    }
    @Test
    void badID4() {
        boolean actual = v.validateID("AA-AAAA");
        assertFalse(actual);
    }

    // The following tests are for the name validator.

    @Test
    void goodName1() {
        boolean actual = v.validateName("AAAAAA");
        assertTrue(actual);
    }
    @Test
    void goodName2() {
        boolean actual = v.validateName("O'Neill");
        assertTrue(actual);
    }
    @Test
    void badName1() {
        boolean actual = v.validateName("1");
        assertFalse(actual);
    }
    @Test
    void badName2() {
        boolean actual = v.validateName("");
        assertFalse(actual);
    }

    // The following tests are for the ZIP validator.

    @Test
    void goodZIP() {
        boolean actual = v.validateZIP("33774");
        assertTrue(actual);
    }
    @Test
    void badZIP1() {
        boolean actual = v.validateZIP("123456");
        assertFalse(actual);
    }
    @Test
    void badZIP2() {
        boolean actual = v.validateZIP("1234");
        assertFalse(actual);
    }
    @Test
    void badZIP3() {
        boolean actual = v.validateZIP("1234A");
        assertFalse(actual);
    }
}