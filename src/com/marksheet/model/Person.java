package com.marksheet.model;

public sealed class Person permits Student {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }
}