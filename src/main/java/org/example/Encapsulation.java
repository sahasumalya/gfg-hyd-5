package org.example;

public class Encapsulation {

    private String firstName;
    protected String lastName;

    /*Encapsulation(String name) {
        this.name = name;
    }*/
    public String getName() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        ///
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
