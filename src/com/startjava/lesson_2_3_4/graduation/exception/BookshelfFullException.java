package com.startjava.lesson_2_3_4.graduation.exception;

public class BookshelfFullException extends RuntimeException {
    public BookshelfFullException(String message) {
        super(message);
    }
}
