package oop.assignment2.ex26;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

class PaymentCalculatorTest {

    @Test
    void exampleTest() {
        PaymentCalculator pc = new PaymentCalculator();
        double actual = pc.calculateMonthsUntilPaidOff(0.000328767, 5000, 100);

        assertEquals(70, actual, 0.01);
    }
}