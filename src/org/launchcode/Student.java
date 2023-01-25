package org.launchcode;

public class Student {
    private String firstName;
    private String lastName;
    private String TA;

    public Student(String firstName, String lastName, String TA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.TA = TA;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTA() {
        return TA;
    }

    public void setTA(String TA) {
        this.TA = TA;
    }

    @Override
    public String toString() {
        return "Student " + firstName + " " + lastName +
                " is in " + TA + "'s TA group.";
    }
}
