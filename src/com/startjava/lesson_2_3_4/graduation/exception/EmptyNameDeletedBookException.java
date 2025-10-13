package com.startjava.lesson_2_3_4.graduation.exception;

public class EmptyNameDeletedBookException extends RuntimeException {
    public EmptyNameDeletedBookException(String message) {
        super((message));
    }
}
