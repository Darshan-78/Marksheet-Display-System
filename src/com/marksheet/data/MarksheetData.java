package com.marksheet.data;

import com.marksheet.model.Semester;
import com.marksheet.model.Subject;

import java.util.List;

public class MarksheetData {

    public static Semester getSemester1() {

        List<Subject> subjects = List.of(
            new Subject("DMA001A", "Engineering Mathematics-I", 4, "D"),
            new Subject("DCO013A", "Computer Programming and Logical Thinking", 3, "C"),
            new Subject("DEN001A", "Communication Skills", 2, "B"),
            new Subject("DPH001A", "Applied Physics", 3, "C"),
            new Subject("JCO001A", "Entrepreneurship Development-I", 1, "B"),
            new Subject("DIN001A", "Cultural Education-I", 2, "A"),
            new Subject("DEN001B", "Communication Skills Lab", 1, "A"),
            new Subject("DCO014A", "Computer Programming and Logical Thinking Lab", 1, "B"),
            new Subject("DPH002A", "Applied Physics Lab", 1, "A"),
            new Subject("DLW001A", "Indian Constitution", 0, "B")
        );

        return new Semester(1, subjects, 18, 7.44);
    }

    public static Semester getSemester2() {

        List<Subject> subjects = List.of(
            new Subject("DMA002A", "Engineering Mathematics-II", 4, "E"),
            new Subject("DCO001A", "Computer Programming in C++", 3, "C"),
            new Subject("DCH002A", "Engineering Chemistry", 3, "C"),
            new Subject("DEE003A", "Basic Electrical and Electronics Engineering", 3, "D"),
            new Subject("DEN002A", "Professional Skills", 2, "A"),
            new Subject("DIN002A", "Cultural Education-II", 2, "C"),
            new Subject("JCO002A", "Entrepreneurship Development-II", 1, "A"),
            new Subject("DEN002B", "Professional Skills Lab", 1, "C"),
            new Subject("DCO002A", "Computer Programming in C++ Lab", 1, "B"),
            new Subject("DCO006A", "Engineering Workshop", 2, "B"),
            new Subject("DME001A", "Engineering Graphics-Auto CAD", 1, "B"),
            new Subject("DCH003A", "Engineering Chemistry Lab", 1, "A"),
            new Subject("DCH004A", "Environmental Sciences", 0, "A+")
        );

        return new Semester(2, subjects, 24, 7.04);
    }

    public static Semester getSemester3() {

        List<Subject> subjects = List.of(
            new Subject("BCO011A", "Computer Networks", 4, "C"),
            new Subject("BCO002B", "Data Structures and Algorithms", 4, "B"),
            new Subject("BCO009B", "Computer Organization and Design", 3, "A"),
            new Subject("BCO008B", "Operating Systems", 3, "C"),
            new Subject("BCO232A", "Software Engineering and Project Management", 3, "C"),
            new Subject("BCO014B", "Operating Systems Lab", 1, "A+"),
            new Subject("BCO005B", "Data Structures and Algorithms Lab", 1, "D"),
            new Subject("DMA011C", "Life Skills-II (Aptitude)", 2, "C"),
            new Subject("DIN003A", "Value Education and Ethics-I", 1, "B")
        );

        return new Semester(3, subjects, 22, 7.57);
    }

    public static Semester getSemester4() {

        List<Subject> subjects = List.of(
            new Subject("BCO081B", "Programming with Python", 3, "B"),
            new Subject("BCO010B", "Database Management Systems", 4, "D"),
            new Subject("BCO094B", "Salesforce", 3, "B"),
            new Subject("BAS007B", "Discrete Mathematics", 3, "B"),
            new Subject("DEN003A", "Life Skills I (Personality Development)", 2, "A+"),
            new Subject("DMA004A", "Quantitative Mathematics", 3, "C"),
            new Subject("BCO013B", "Database Management System Lab", 1, "A+"),
            new Subject("BCO082B", "Programming with Python Lab", 1, "A+"),
            new Subject("DIN004A", "Value Education and Ethics-II", 1, "A")
        );

        return new Semester(4, subjects, 21, 7.81);
    }

    public static Semester getSemester5() {

        List<Subject> subjects = List.of(
            new Subject("BCO007A", "Computer Graphics", 3, "A"),
            new Subject("BCO015B", "Computer Graphics Lab", 1, "A"),
            new Subject("BCO017A", "Formal Languages and Automation Theory", 4, "C"),
            new Subject("BCO023A", "Design and Analysis of Algorithms", 4, "B"),
            new Subject("BCO025B", "Design and Analysis of Algorithms Lab", 1, "A"),
            new Subject("BCO035B", "Programming in Java", 3, "C"),
            new Subject("BCO068B", "Programming in Java Lab", 1, "A+"),
            new Subject("BCO101C", "Salesforce - Technical Aspirants", 3, "A"),
            new Subject("NPTEL0170A", "SOFT SKILLS", 3, "A")
        );

        return new Semester(5, subjects, 23, 8.24);
    }

    public static Semester getSemester6() {

        List<Subject> subjects = List.of(
            new Subject("BCO019A", "Artificial Intelligence", 3, "B"),
            new Subject("BCO028B", "Compiler Construction", 4, "A"),
            new Subject("BCO031B", "Compiler Design Lab", 1, "E"),
            new Subject("BCO037B", "Advance Programming in Java", 3, "A"),
            new Subject("BCO069B", "Advance Programming in Java Lab", 1, "A+"),
            new Subject("BCO074C", "Minor Project", 4, "A"),
            new Subject("NPTEL783A", "Principles of Management", 3, "A")
        );

        return new Semester(6, subjects, 19, 8.66);
    }
}