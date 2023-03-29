package edu.matc.entity;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void getAge() {
        // create the object that has the method I want to test
        User user = new User();

        // set birthdate for user
        LocalDate dob = LocalDate.parse("1977-08-19");
        user.setDateOfBirth(dob);

        // create a variable for the expected value
        int expectedAge = 45;

        // call the method and get the actual value
        int actualAge = user.getAge();

        // compare the two, pass/fail
        assertEquals(expectedAge, actualAge);
    }
}