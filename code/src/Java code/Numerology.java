
/*
 * Author: Suheilee Amashki Samarasinghe
 * Created: 18.05.2024
 * Modified: 20.05.2024 - added code to calculate lifepath
21.05.2024 - added code to find the lucky colour, inform whether the lifepath is a master number, and find the generation
22.05.2024 - ability to compare the lifepaths of 2 given birthdays
 * Programme: Numerology.java
 * Description: Calculates the lifepath and lucky colour  of a given birthday, inform whether the lifepath is a master number; finds the generation of the birthday; compares the lifepaths of 2 given birthdays
 */

import java.util.*;

public class Numerology {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get the birthday
        String birthDay1 = Validate.getBirthday(input);
        // split the user input into day, month and year; and convert it to integers
        int date1 = Validate.getDate(birthDay1, input);
        int month1 = Validate.getMonth(birthDay1, input);
        int year1 = Validate.getYear(birthDay1, input);

        // calculate the lifepath
        int lifePath1 = LifePath.calcLifePath(date1, month1, year1);
        System.out.println("The life path is: " + lifePath1);

        // find lucky colour
        String luckyColour = Colour.getLuckyColour(lifePath1);
        System.out.println("The Lucky Colour is: " + luckyColour);

        // check if it is a master number
        Compare.checkMasterNumber(lifePath1);

        // calculate generation
        String generation = Gen.getGeneration(year1);
        System.out.println("Your generation is: " + generation);

        // compare 2 lifepaths
        // receive the second birthday
        System.out.println("To compare a second birthday,");
        String birthDay2 = Validate.getBirthday(input);

        // split the user input into day, month and year; convert to integers and
        // validate it
        int date2 = Validate.getDate(birthDay2, input);
        int month2 = Validate.getMonth(birthDay2, input);
        int year2 = Validate.getYear(birthDay2, input);

        // calculate the lifepath for the 2nd birthday
        int lifePath2 = LifePath.calcLifePath(date2, month2, year2);

        // compare the lifepaths
        Compare.compareLifePaths(lifePath1, lifePath2);
    }
}
