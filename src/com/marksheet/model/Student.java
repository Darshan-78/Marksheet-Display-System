package com.marksheet.model;

public final class Student extends Person {

    private String registrationNumber;
    private String fatherName;
    private String school;
    private String degree;

    public Student(String name, String registrationNumber,
                   String fatherName, String school, String degree) {

        super(name);
        this.registrationNumber = registrationNumber;
        this.fatherName = fatherName;
        this.school = school;
        this.degree = degree;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getSchool() {
        return school;
    }

    public String getDegree() {
        return degree;
    }
}