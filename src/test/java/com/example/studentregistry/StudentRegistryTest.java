package com.example.studentregistry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentRegistryTest {

    @Test
    public void shouldRegisterStudent() throws StudentAlreadyRegisteredException {
        StudentRegistry registry = new StudentRegistry();
        Student student = new Student("1", "John Doe");

        registry.register(student);

        assertTrue(registry.isStudentRegistered("1"));
    }

    @Test
    public void shouldThrowExceptionForDuplicateRegistration() {
        StudentRegistry registry = new StudentRegistry();
        Student student = new Student("1", "John Doe");

        assertDoesNotThrow(() -> registry.register(student));

        assertThrows(StudentAlreadyRegisteredException.class, () -> {
            registry.register(student);
        });
    }
}
