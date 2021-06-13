package oop.assignment2.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

    @Test
    void veryWeak() {
        PasswordCheck pc = new PasswordCheck();
        int actual = pc.passwordValidator("123");

        assertEquals(0,actual);
    }

    @Test
    void weakOnlyLetters() {
        PasswordCheck pc = new PasswordCheck();
        int actual = pc.passwordValidator("abcd");

        assertEquals(1,actual);
    }

    @Test
    void weakLettersNumbers() {
        PasswordCheck pc = new PasswordCheck();
        int actual = pc.passwordValidator("abcd1");

        assertEquals(1,actual);
    }

    @Test
    void average() {
        PasswordCheck pc = new PasswordCheck();
        int actual = pc.passwordValidator("01234567");

        assertEquals(2,actual);
    }

    @Test
    void aboveAverage() {
        PasswordCheck pc = new PasswordCheck();
        int actual = pc.passwordValidator("hellothere");

        assertEquals(3,actual);
    }

    @Test
    void strong() {
        PasswordCheck pc = new PasswordCheck();
        int actual = pc.passwordValidator("hellothere123");

        assertEquals(4,actual);
    }

    @Test
    void veryStrong() {
        PasswordCheck pc = new PasswordCheck();
        int actual = pc.passwordValidator("heym@n123");

        assertEquals(5,actual);
    }

}