package org.example.exceptions;

public class ClassNotLoadedException extends Exception {
    public ClassNotLoadedException(String message) {
        super(message);
    }
}