package com.example.studentregistry;

import java.util.*;

public class ExamRegistry {

    private Map<Exam, List<Student>> examEnrollment = new HashMap<>();
    private Map<String, Integer> examScores = new HashMap<>();

    // Enroll a student in an exam
    public void enrol(Student student, Exam exam) {
        // TODO: Implement the method to address unit test requirements
    }

    // Record a student's score in an exam
    public void recordScore(Student student, Exam exam, int score) throws InvalidScoreException {
        // TODO: Implement the method to address unit test requirements
    }

    // Get the student's score for an exam
    public int getScore(Student student, Exam exam) {
        String key = student.getId() + "-" + exam.getCode();
        return examScores.getOrDefault(key, -1);  // return -1 if no score
    }

    // Check if a student is enrolled in the exam
    public boolean isEnrolled(Student student, Exam exam) {
        List<Student> students = examEnrollment.get(exam);
        return students != null && students.contains(student);
    }
}

