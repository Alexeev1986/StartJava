package com.startjava.lesson_2_3_4.graduation;

import java.time.Year;

public class Book {

    private final String author;
    private final String title;
    private final int year;

    public Book(String author, String title, int year) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Автор не может быть пустым");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название книги не может быть пустым");
        }
        if (year < 1800 || year > java.time.Year.now().getValue()) {
            throw new IllegalArgumentException("Год издания должен быть между 1800 г. и текущим годом");
        }
        this.author = author.trim();
        this.title = title.trim();
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + year;
    }

    public int getLength() {
        return toString().length();
    }
}
