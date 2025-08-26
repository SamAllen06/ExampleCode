package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2024IsLeapYear() {
        LeapYearCalculatorTest LeapYear = new LeapYearCalculatorTest();
        boolean result = LeapYear.isLeapYear(2024);
        Assertions.assertTrue(result);
    }
}
