package com.startjava.lesson_2_3_4.graduationproject;

public class Book {

    private final String author;
    private final String title;
    private final int year;

    public Book(String author, String title, int year) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Автор не может быть пустым");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Название книги не может быть пустым");
        }
        if (year == 0) {
            throw new IllegalArgumentException("Год издания не может быть пустым");
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
        return "Книга{ "
                + "Автор = " + author
                + ", Название = " + title
                + ", Год выпуска = " + year
                + " }";
    }

}
