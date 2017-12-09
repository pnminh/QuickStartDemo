package com.minh;

public class Name {
    private final String firstName;
    private final String lastName;
    private final String middleName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
}
