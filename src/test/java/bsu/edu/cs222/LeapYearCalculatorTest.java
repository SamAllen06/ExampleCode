package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2025IsLeapYear() {
        LeapYear LeapYear = new LeapYear();
        boolean result = LeapYear.isLeapYear(2025);
        Assertions.assertFalse(result);
    }
}
