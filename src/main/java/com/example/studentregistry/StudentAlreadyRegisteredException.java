package com.example.studentregistry;

// Exception for duplicate student registration
public class StudentAlreadyRegisteredException extends Exception {
    public StudentAlreadyRegisteredException(String message) {
        super(message);
    }
}
