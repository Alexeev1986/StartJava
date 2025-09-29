package com.startjava.lesson_2_3_4.graduation;

import java.time.Year;

public class Book {

    private static final Year INITIAL_PERIOD = Year.of(1800);
    private final String author;
    private  final String title;
    private final Year publicationYear;

    public Book(String author, String title, int publicationYear) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Автор не может быть пустым");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название книги не может быть пустым");
        }
        if (Year.of(publicationYear).isBefore(INITIAL_PERIOD) || Year.of(publicationYear).isAfter(Year.now())) {
            throw new IllegalArgumentException("Год издания должен быть между " + INITIAL_PERIOD +
                    " г. и текущим годом");
        }
        this.author = author.trim();
        this.title = title.trim();
        this.publicationYear = Year.of(publicationYear);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear.getValue();
    }

    public int getLength() {
        return toString().length();
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }
}
