This is code developed as part of "Introduction to Software Engineering" module, taken Semester 1, 2024. There is not prior commits as this project was not initially created through GitHub.
My final grade for the module was: 70/100

Project Summary

**Numerology Calculator** – A Java program that analyzes a birth date to reveal:

- **Life Path Number** (digital root with master numbers 11, 22, 33)
- **Lucky Colour** (mapped to life path)
- **Master Number Status**
- **Generation** (Silent Generation to Generation Alpha)
- **Comparison** of two birthdays' life paths

Input validation: day (1–31), month (1–12 or month names), year (1901–2024).

## 🧪 Testing

This project demonstrates software testing techniques as part of an academic assignment:

- **Black‑box tests** – Equivalence partitioning & boundary value analysis for all modules
- **White‑box tests** – Path coverage for key logic (digital root, month conversion)
- **Unit tests** – JUnit 4 test suite covering `Colour`, `Compare`, `Gen`, `LifePath`, `Validate`
- **Manual test driver** (`WhiteBox.java`) for interactive validation

All tests pass in a Linux command‑line environment.

## 🚀 Run the program

```bash
javac *.java
java Numerology
```

## 🧪 Run the tests

```bash
javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" *Test.java
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore ColourTest CompareTest GenTest LifePathTest ValidateTest
```

---
