@'
# Marksheet Display System

A Java-based command-line application that displays the semester-wise grade card of a student.

## Features

- Semester-wise grade card display from Semester 1 to Semester 6
- Displays subject codes, subjects, credits, grades, total credits, and SGPA
- User can select any semester from 1 to 6
- If no input is provided for 20 seconds, the next semester is displayed automatically
- User can enter another semester during the 20-second waiting period
- Semester 6 is the final semester
- Uses Java Module System
- Uses switch expressions with arrow syntax
- Uses Java Text Blocks
- Uses Sealed Classes
- Demonstrates Inheritance
- Uses Generics
- Uses Multithreading with a background input thread and BlockingQueue

## Student Information

- **Name:** DARSHAN HITESH JAIN
- **Registration Number:** 23BCON1827
- **University:** JECRC University (Jaipur)
- **School:** School of Engineering and Technology
- **Degree:** Bachelor of Technology

## Java Concepts Demonstrated

### Module System

The project uses Java's Module System through `module-info.java`.

### Switch Expressions

Modern switch expressions with arrow syntax are used for semester selection.

```java
return switch (input.trim()) {
    case "1" -> 1;
    case "2" -> 2;
    case "3" -> 3;
    case "4" -> 4;
    case "5" -> 5;
    case "6" -> 6;
    default -> -1;
};