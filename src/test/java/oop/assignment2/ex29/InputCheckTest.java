package oop.assignment2.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputCheckTest {

    private static InputCheck ic = new InputCheck();

    @Test
    void numberInput() {
        boolean actual = ic.inputChecker("1234");
        assertTrue(actual);
    }
    @Test
    void badInput() {
        boolean actual = ic.inputChecker("uhhhh");
        assertFalse(actual);
    }
    @Test
    void zeroInput() {
        boolean actual = ic.inputChecker("0");
        assertFalse(actual);
    }
}