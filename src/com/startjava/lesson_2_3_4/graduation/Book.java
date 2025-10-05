package com.startjava.lesson_2_3_4.graduation;

import java.time.Year;

public class Book {

    private static final Year INITIAL_PERIOD = Year.of(1800);
    private final String author;
    private final String title;
    private final Year publishedYear;

    public Book(String author, String title, int publishedYear) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Автор не может быть пустым");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название книги не может быть пустым");
        }
        if (Year.of(publishedYear).isBefore(INITIAL_PERIOD) ||
                Year.of(publishedYear).isAfter(Year.now())) {
            throw new IllegalArgumentException("Год издания должен быть между " +
                    INITIAL_PERIOD + " г. и " + Year.now() + " г.");
        }
        this.author = author.trim();
        this.title = title.trim();
        this.publishedYear = Year.of(publishedYear);
    }

    public String getTitle() {
        return title;
    }

    public int getTextLength() {
        return toString().length();
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishedYear;
    }
}
