import java.util.Scanner;

public class Validate{

    static String getBirthday(Scanner input) {
        System.out.println("Please enter the date of birth in the the format (dd/mm/yyyy): ");
        String birthDay = input.nextLine();

        while (birthDay.isEmpty()) {
            System.out.println("Birthday cannot be empty. Please re-enter: ");
            birthDay = input.nextLine();
        }
        return birthDay;
    }

    // ensure that the date is between 0 - 31
    static int getDate(String birthDay, Scanner input) {
        boolean correct = true;
        String parts[] = birthDay.split("/");
        String daySplit = parts[0].trim();
        int date;
        try {
            date = Integer.parseInt(daySplit); 
        } catch (Exception e) {
            System.out.println("Error: " + e);
            while(!input.hasNextInt()){
                System.out.println("Please re-enter a date in digits: ");
            }
            date = input.nextInt();
        }

        do {
            // check if the date is less than 1
            if (date < 1) {
                System.out.println("Date cannot be less than 1. Please re-enter your date only: ");
                date = input.nextInt();
                correct = false;
            }
            // check if the year is after 2024
            else if (date > 31) {
                System.out.println("Date cannot be more than 31. Please re-enter your date only: ");
                date = input.nextInt();
                correct = false;
            }
            // exit the loop if the date is valid
            else {
                correct = true;
            }
        } while (correct == false);
        return date;
    }

    // ensure that the year is between 1901 - 2024
    static int getYear(String birthDay, Scanner input) {
        boolean correctYear = true;
        String parts[] = birthDay.split("/");
        String yearSplit = parts[2].trim();
        int year;
        try {
            year = Integer.parseInt(yearSplit); 
        } catch (Exception e) {
            System.out.println("Error: " + e);
            while(!input.hasNextInt()){
                System.out.println("Please re-enter a year in digits: ");
            }
            year = input.nextInt();
        }

        do {
            // check if the year is before 1901
            if (year < 1901) {
                System.out.println("Year should not be before 1901. Please re-enter your year only: ");
                year = input.nextInt();
                correctYear = false;
            }
            // check if the year is after 2024
            else if (year > 2024) {
                System.out.println("Year cannot be after 2024. Please re-enter your year only: ");
                year = input.nextInt();
                correctYear = false;
            }
            // exit the loop if the year is valid
            else {
                correctYear = true;
            }
        } while (correctYear == false);
        return year;
    }

    static int getMonth(String birthDay, Scanner input) {
        boolean correct = true;
        String parts[] = birthDay.split("/");
        String monthSplit = parts[1].trim();
        int month = 0;
        do {
            try {
                month = Integer.parseInt(monthSplit);
            } catch (NumberFormatException e) {
                month = monthToInt(monthSplit.trim());
                if (month == 0) {
                    System.out.println("Error: " + e);
                    System.out.println("Invalid Input: " + monthSplit);
                    System.out.println("Please re enter your month only: ");
                    monthSplit = input.nextLine();
                    correct = false;
                }
            }
            if (month < 0) {
                System.out.println("Month cannot be negative. Please re enter the month only: ");
                monthSplit = input.nextLine();
                correct = false;
            } else if (month > 12) {
                System.out.println("Month cannot be more than 12. Please re enter the month only: ");
                monthSplit = input.nextLine();
                correct = false;
            } else {
                correct = true;
            }
        } while (correct == false);
        return month;
    }

    // converting the month given in words to integers
    private static int monthToInt(String month) {
        int monthInt = 0;
        switch (month.toUpperCase()) {
        case "JANUARY":
        case "JAN":
            monthInt = 1;
            break;

        case "FEBRUARY":
        case "FEB":
            monthInt = 2;
            break;

        case "MARCH":
        case "MAR":
            monthInt = 3;
            break;

        case "APRIL":
        case "APR":
            monthInt = 4;
            break;

        case "MAY":
            monthInt = 5;
            break;

        case "JUNE":
        case "JUN":
            monthInt = 6;
            break;

        case "JULY":
        case "JUL":
            monthInt = 7;
            break;

        case "AUGUST":
        case "AUG":
            monthInt = 8;
            break;

        case "SEPTEMBER":
        case "SEP":
            monthInt = 9;
            break;

        case "OCTOBER":
        case "OCT":
            monthInt = 10;
            break;

        case "NOVEMBER":
        case "NOV":
            monthInt = 11;
            break;

        case "DECEMBER":
        case "DEC":
            monthInt = 12;
            break;
        }
        return monthInt;
    }
}
