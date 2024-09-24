package com.example.studentregistry;

// Exception for invalid exam scores
public class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}