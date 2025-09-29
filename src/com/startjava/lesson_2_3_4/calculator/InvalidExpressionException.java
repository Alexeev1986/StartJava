package com.startjava.lesson_2_3_4.calculator;

public class InvalidExpressionException extends RuntimeException {
    public InvalidExpressionException(String message) {
        super(message);
    }
}
