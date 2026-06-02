import java.util.Scanner;

public class WhiteBox {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Testing getDate method
        System.out.println("Testing getDate method...");
        testGetDate("15/01/2004", input, 15);
        testGetDate("00/01/2004", input, "Date cannot be less than 1");
        testGetDate("32/01/2004", input, "Date cannot be more than 31");

        // Testing getMonth method
        System.out.println("\nTesting getMonth method...");
        testGetMonth("01/05/2004", input, 5);
        testGetMonth("01/00/2004", input, "Month cannot be negative or zero");
        testGetMonth("01/7972/2004", input, "Month cannot be more than 12");
        testGetMonth("01/June/2004", input, 6);
        testGetMonth("01/Samarasinghe/2004", input, "Invalid month: Samarasinghe");

        input.close();
    }

    private static void testGetDate(String birthDay, Scanner input, Object expected) {
        try {
            int date = Validate.getDate(birthDay, input);
            if (date == (int) expected) {
                System.out.println("Test passed for input: " + birthDay);
            } else {
                System.out.println("Test failed for input: " + birthDay + ". Expected: " + expected + ", but got: " + date);
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains((String) expected)) {
                System.out.println("Test passed for input: " + birthDay);
            } else {
                System.out.println("Test failed for input: " + birthDay + ". Expected error: " + expected + ", but got: " + e.getMessage());
            }
        }
    }

    private static void testGetMonth(String birthDay, Scanner input, Object expected) {
        try {
            int month = Validate.getMonth(birthDay, input);
            if (month == (int) expected) {
                System.out.println("Test passed for input: " + birthDay);
            } else {
                System.out.println("Test failed for input: " + birthDay + ". Expected: " + expected + ", but got: " + month);
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains((String) expected)) {
                System.out.println("Test passed for input: " + birthDay);
            } else {
                System.out.println("Test failed for input: " + birthDay + ". Expected error: " + expected + ", but got: " + e.getMessage());
            }
        }
    }
}
