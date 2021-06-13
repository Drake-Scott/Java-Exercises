package oop.assignment2.ex26;

import oop.assignment2.ex25.PasswordCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void exampleTest() {
        PaymentCalculator pc = new PaymentCalculator();
        double actual = pc.calculateMonthsUntilPaidOff(0.000328767, 5000, 100);

        assertEquals(70, actual, 0.01);
    }
}