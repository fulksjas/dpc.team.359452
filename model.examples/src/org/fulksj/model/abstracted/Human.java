package org.fulksj.model.abstracted;

import java.util.Date;

/**
 * This is a Java file named Human.java.
 * It defines an abstract class called Human with private instance variables for first name, last name, date of birth, and gender.
 * As humans have to be either male or female, only those two classes can be created and uses this class
 */
public abstract class Human {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
}
