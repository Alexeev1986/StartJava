package com.startjava.lesson_2_3_4.calculator;

public class InvalidNumberException extends RuntimeException{
    public InvalidNumberException(String message) {
        super(message);
    }
}
