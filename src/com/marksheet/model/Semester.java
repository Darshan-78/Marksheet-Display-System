package com.marksheet.model;

import java.util.List;

public class Semester {

    private int semesterNumber;
    private List<Subject> subjects;
    private int totalCredits;
    private double sgpa;

    public Semester(int semesterNumber, List<Subject> subjects,
                    int totalCredits, double sgpa) {
        this.semesterNumber = semesterNumber;
        this.subjects = subjects;
        this.totalCredits = totalCredits;
        this.sgpa = sgpa;
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public double getSgpa() {
        return sgpa;
    }
}