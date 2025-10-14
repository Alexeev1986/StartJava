package com.startjava.lesson_2_3_4.graduation.exception;

public class NotExistBookException extends RuntimeException {
    public NotExistBookException(String message) {
        super((message));
    }
}
