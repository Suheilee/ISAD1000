package Test code;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ValidateTest {

    @Test
    public void testGetBirthday_Empty() {
        String input = "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        String result = Validate.getBirthday(scanner);
        assertEquals("Birthday cannot be empty. Please re-enter: ", result);
    }

    @Test
    public void testGetBirthday_Valid() {
        String input = "5/8/2004\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        String result = Validate.getBirthday(scanner);
        assertEquals("5/8/2004", result);
    }

    @Test
    public void testGetDate_Valid() {
        String birthDay = "24/5/2004";
        String input = "24\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getDate(birthDay, scanner);
        assertEquals(24, result);
    }

    @Test
    public void testGetDate_LessThanOne() {
        String birthDay = "-9/5/2004";
        String input = "-9\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getDate(birthDay, scanner);
        assertEquals(1, result);
    }

    @Test
    public void testGetDate_MoreThanThirtyOne() {
        String birthDay = "54/5/2004";
        String input = "54\n31\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getDate(birthDay, scanner);
        assertEquals(31, result);
    }

    @Test
    public void testGetMonth_Valid() {
        String birthDay = "24/6/2004";
        String input = "6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getMonth(birthDay, scanner);
        assertEquals(6, result);
    }

    @Test
    public void testGetMonth_LessThanOne() {
        String birthDay = "24/-9/2004";
        String input = "-9\n6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getMonth(birthDay, scanner);
        assertEquals(6, result);
    }

    @Test
    public void testGetMonth_MoreThanTwelve() {
        String birthDay = "24/54/2004";
        String input = "54\n6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getMonth(birthDay, scanner);
        assertEquals(6, result);
    }

    @Test
    public void testGetMonth_ValidString() {
        String birthDay = "24/June/2004";
        String input = "June\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getMonth(birthDay, scanner);
        assertEquals(6, result);
    }

    @Test
    public void testGetMonth_InvalidString() {
        String birthDay = "24/String/2004";
        String input = "String\n6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getMonth(birthDay, scanner);
        assertEquals(6, result);
    }

    @Test
    public void testGetYear_Valid() {
        String birthDay = "24/5/2003";
        String input = "2003\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getYear(birthDay, scanner);
        assertEquals(2003, result);
    }

    @Test
    public void testGetYear_LessThan1901() {
        String birthDay = "24/5/1505";
        String input = "1505\n1901\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getYear(birthDay, scanner);
        assertEquals(1901, result);
    }

    @Test
    public void testGetYear_MoreThan2024() {
        String birthDay = "24/5/2054";
        String input = "2054\n2024\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        int result = Validate.getYear(birthDay, scanner);
        assertEquals(2024, result);
    }

    @Test
    public void testMonthToInt_ValidMonthFullName() {
        int result = Validate.monthToInt("January");
        assertEquals(1, result);
    }

    @Test
    public void testMonthToInt_ValidMonthShortForm() {
        int result = Validate.monthToInt("Dec");
        assertEquals(12, result);
    }

    @Test
    public void testMonthToInt_InvalidMonth() {
        int result = Validate.monthToInt("fsdf");
        assertEquals(0, result);
    }

    //BVA for the ValidateTest modules
    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class ValidateTest {

    // Boundary Value Analysis (BVA) Tests for getDate
    @Test
    public void testGetDate_BelowMinBoundary() {
        String birthDay = "00/01/2004";
        Scanner input = new Scanner("");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Validate.getDate(birthDay, input);
        });
        assertTrue(exception.getMessage().contains("Date cannot be less than 1"));
    }

    @Test
    public void testGetDate_MinBoundary() {
        String birthDay = "01/01/2004";
        Scanner input = new Scanner("");
        int date = Validate.getDate(birthDay, input);
        assertEquals(1, date);
    }

    @Test
    public void testGetDate_MaxBoundary() {
        String birthDay = "31/01/2004";
        Scanner input = new Scanner("");
        int date = Validate.getDate(birthDay, input);
        assertEquals(31, date);
    }

    @Test
    public void testGetDate_AboveMaxBoundary() {
        String birthDay = "32/01/2004";
        Scanner input = new Scanner("");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Validate.getDate(birthDay, input);
        });
        assertTrue(exception.getMessage().contains("Date cannot be more than 31"));
    }

    // Boundary Value Analysis (BVA) Tests for getYear
    @Test
    public void testGetYear_BelowMinBoundary() {
        String birthDay = "04/03/1900";
        Scanner input = new Scanner("");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Validate.getYear(birthDay, input);
        });
        assertTrue(exception.getMessage().contains("Year should not be before 1901"));
    }

    @Test
    public void testGetYear_MinBoundary() {
        String birthDay = "04/03/1901";
        Scanner input = new Scanner("");
        int year = Validate.getYear(birthDay, input);
        assertEquals(1901, year);
    }

    @Test
    public void testGetYear_MaxBoundary() {
        String birthDay = "04/03/2024";
        Scanner input = new Scanner("");
        int year = Validate.getYear(birthDay, input);
        assertEquals(2024, year);
    }

    @Test
    public void testGetYear_AboveMaxBoundary() {
        String birthDay = "04/03/2025";
        Scanner input = new Scanner("");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Validate.getYear(birthDay, input);
        });
        assertTrue(exception.getMessage().contains("Year cannot be after 2024"));
    }

    // Boundary Value Analysis (BVA) Tests for getMonth
    @Test
    public void testGetMonth_BelowMinBoundary() {
        String birthDay = "01/00/2004";
        Scanner input = new Scanner("");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Validate.getMonth(birthDay, input);
        });
        assertTrue(exception.getMessage().contains("Month cannot be negative"));
    }

    @Test
    public void testGetMonth_MinBoundary() {
        String birthDay = "01/01/2004";
        Scanner input = new Scanner("");
        int month = Validate.getMonth(birthDay, input);
        assertEquals(1, month);
    }

    @Test
    public void testGetMonth_MaxBoundary() {
        String birthDay = "01/12/2004";
        Scanner input = new Scanner("");
        int month = Validate.getMonth(birthDay, input);
        assertEquals(12, month);
    }

    @Test
    public void testGetMonth_AboveMaxBoundary() {
        String birthDay = "01/13/2004";
        Scanner input = new Scanner("");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Validate.getMonth(birthDay, input);
        });
        assertTrue(exception.getMessage().contains("Month cannot be more than 12"));
    }
}

}
