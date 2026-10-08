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

### 1. Module System

The project uses Java's Module System through `module-info.java`.

### 2. Switch Expressions

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
```

### 3. Text Blocks

Java Text Blocks are used to format the grade card and console messages.

```java
System.out.println("""
        ================================
             MARKSHEET DISPLAY SYSTEM
        ================================
        """);
```

### 4. Sealed Classes

Sealed classes are used to control which classes can inherit from a parent class.

```java
public sealed class Person permits Student {
}

public final class Student extends Person {
}
```

### 5. Inheritance

The `Student` class inherits from the `Person` class.

```java
public final class Student extends Person {
}
```

### 6. Generics

A generic repository is used to store and manage semester objects.

```java
MarksheetRepository<Semester> repository =
        new MarksheetRepository<>();
```

### 7. Multithreading

A dedicated background thread continuously listens for user input.

A `BlockingQueue` transfers input from the background input thread to the main program.

The application waits for a maximum of 20 seconds for user input. If no input is received, the next semester is displayed automatically.

## Project Structure

```text
Marksheet-Display-System
│
├── src
│   ├── module-info.java
│   │
│   └── com
│       └── marksheet
│           ├── Main.java
│           │
│           ├── data
│           │   ├── MarksheetData.java
│           │   └── MarksheetRepository.java
│           │
│           ├── model
│           │   ├── Person.java
│           │   ├── Student.java
│           │   ├── Subject.java
│           │   └── Semester.java
│           │
│           └── service
│               ├── InputService.java
│               └── MarksheetService.java
│
├── .gitignore
└── README.md
```

## Semester Information

| Semester | Total Credits | SGPA |
|----------|---------------|------|
| Semester 1 | 18 | 7.44 |
| Semester 2 | 24 | 7.04 |
| Semester 3 | 22 | 7.57 |
| Semester 4 | 21 | 7.81 |
| Semester 5 | 23 | 8.24 |
| Semester 6 | 19 | 8.66 |

## Program Flow

The application first asks the user to select a semester.

```text
Enter semester number:
3
```

The selected semester is displayed.

After displaying it, the program waits for up to 20 seconds for another input.

### If no input is given

The next semester is displayed automatically.

Example:

```text
3 → 4 → 5 → 6 → Exit
```

### If the user enters another semester

The entered semester is displayed immediately.

Example:

```text
3 → 5
```

The 20-second waiting period then starts again.

The user can enter any valid semester number from 1 to 6.

### Semester 6

Semester 6 is the final semester.

After displaying Semester 6, the application exits:

```text
All semesters completed. Exiting...
```

## Requirements

- Java Development Kit (JDK)
- PowerShell, Command Prompt, or Terminal

A recent JDK version is recommended because the project uses modern Java language features.

## How to Compile

```powershell
javac -d out src/module-info.java src/com/marksheet/Main.java src/com/marksheet/data/*.java src/com/marksheet/model/*.java src/com/marksheet/service/*.java
```

## How to Run

```powershell
java --module-path out -m marksheet/com.marksheet.Main
```

## Example

The application starts with a semester selection menu:

```text
================================================================
                 MARKSHEET DISPLAY SYSTEM
================================================================
Student : DARSHAN HITESH JAIN
Reg. No.: 23BCON1827
================================================================

Select a semester:
1. Semester 1
2. Semester 2
3. Semester 3
4. Semester 4
5. Semester 5
6. Semester 6
================================================================
Enter semester number:
```

After selecting a semester, its grade card displays:

- Subject Code
- Subject Name
- Credits
- Grade
- Total Credits
- SGPA

## Technologies Used

- Java
- Java Module System
- Java Collections Framework
- Java Generics
- Java Concurrency and Multithreading
- Switch Expressions
- Text Blocks
- Sealed Classes

## Author

**Darshan Jain**

B.Tech Computer Science and Engineering  
JECRC University, Jaipur