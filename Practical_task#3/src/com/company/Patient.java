package com.company;

public class Patient {
    protected String lastName;

    public Patient(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName;
    }
}
