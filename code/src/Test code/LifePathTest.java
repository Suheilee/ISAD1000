package Test code;

import org.junit.Test;
import static org.junit.Assert.*;

public class LifePathTest {
    // Tests for calcLifePath
    @Test
    public void testCalcLifePath_ValidInput() {
        int date = 12;
        int month = 3;
        int year = 1992;
        int expectedLifePath = 9;
        assertEquals(expectedLifePath, LifePath.calcLifePath(date, month, year));
    }

    @Test
    public void testCalcLifePath_MasterNumber() {
        int date = 22;
        int month = 9;
        int year = 2000;
        int expectedLifePath = 33;
        assertEquals(expectedLifePath, LifePath.calcLifePath(date, month, year));
    }

    // Tests for getDigitalRoot
    @Test
    public void testGetDigitalRoot_SingleDigit() {
        int input = 5;
        int expectedRoot = 5;
        assertEquals(expectedRoot, LifePath.getDigitalRoot(input));
    }

    @Test
    public void testGetDigitalRoot_MultipleDigits() {
        int input = 38;
        int expectedRoot = 2;
        assertEquals(expectedRoot, LifePath.getDigitalRoot(input));
    }

    @Test
    public void testGetDigitalRoot_MasterNumber() {
        int input = 11;
        int expectedRoot = 11;
        assertEquals(expectedRoot, LifePath.getDigitalRoot(input));
    }
}

