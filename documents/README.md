# Numerology Program

## Overview

The Numerology Program is a Java application that calculates various numerological aspects based on a user's date of birth. It includes features such as determining the life path number, lucky color, master number status, generational categorization, and comparison of life path numbers between two dates.

## Files and Descriptions

### Numerology.java

This is the main file of the application that orchestrates the flow of the program by calling various modules to perform specific tasks.

**Functions:**
- **main**: Coordinates the overall process including obtaining user input, calculating life path number, finding lucky color, checking master number status, determining generation, and comparing life paths.

### Validate.java

Handles the validation and extraction of the date, month, and year from the birthday string input by the user.

**Functions:**
- **getBirthday**: Prompts the user for their birthday and ensures a non-empty string is entered.
- **getDate**: Extracts and validates the date part from the birthday string.
- **getMonth**: Extracts and validates the month part from the birthday string. Converts month names to numbers if necessary.
- **getYear**: Extracts and validates the year part from the birthday string.

### LifePath.java

Contains methods related to the calculation of the life path number.

**Functions:**
- **calcLifePath**: Calculates the life path number by summing the digital roots of the date, month, and year.
- **getDigitalRoot**: Calculates the digital root of a given integer.

### Colour.java

Handles the determination of the lucky color based on the life path number.

**Functions:**
- **getLuckyColour**: Determines the lucky color based on the life path number.

### Compare.java

Contains methods for comparing life paths and checking master numbers.

**Functions:**
- **compareLifePaths**: Compares two life path numbers and prints whether they are equal or not.
- **checkMasterNumber**: Checks if the life path number is a master number (11, 22, or 33).

### Gen.java

Handles the determination of the generation based on the year of birth.

**Functions:**
- **getGeneration**: Determines the generation category based on the year of birth.

### monthToInt.java

Contains a method to convert month names to their corresponding numeric values.

**Functions:**
- **monthToInt**: Converts month names to their corresponding numeric values.

## Testing

The program has been rigorously tested using black-box testing (equivalence partitioning and boundary value analysis) and white-box testing to ensure robustness and accuracy. Each module has been validated against expected outputs to handle a variety of inputs, including edge cases.

## Usage

To run the program, compile the `Numerology.java` file and execute the main method. Follow the prompts to enter the required information, and the program will display the calculated numerological aspects.

```bash
javac Numerology.java
java Numerology

