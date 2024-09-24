package com.example.studentregistry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExamRegistryTest {

    @Test
    public void shouldEnrollStudentInExam() {
        ExamRegistry examRegistry = new ExamRegistry();
        Student student = new Student("1", "John Doe");
        Exam exam = new Exam("Math", "MATH101");

        examRegistry.enroll(student, exam);

        assertTrue(examRegistry.isEnrolled(student, exam));
    }

    @Test
    public void shouldRecordValidScore() throws InvalidScoreException {
        ExamRegistry examRegistry = new ExamRegistry();
        Student student = new Student("1", "John Doe");
        Exam exam = new Exam("Math", "MATH101");

        examRegistry.enroll(student, exam);
        examRegistry.recordScore(student, exam, 85);

        assertEquals(85, examRegistry.getScore(student, exam));
    }

    @Test
    public void shouldThrowExceptionForInvalidScore() {
        ExamRegistry examRegistry = new ExamRegistry();
        Student student = new Student("1", "John Doe");
        Exam exam = new Exam("Math", "MATH101");

        examRegistry.enroll(student, exam);
        assertThrows(InvalidScoreException.class, () -> {
            examRegistry.recordScore(student, exam, 150);
        });
    }
}

