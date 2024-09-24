package com.example.studentregistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> students = new HashMap<>();

    // Register a student
    public void register(Student student) throws StudentAlreadyRegisteredException {
        // TODO: Implement the method to address unit test requirements
    }

    // Check if a student is registered
    public boolean isStudentRegistered(String studentId) {
        return students.containsKey(studentId);
    }
}

