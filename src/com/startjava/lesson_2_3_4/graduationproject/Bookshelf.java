package com.startjava.lesson_2_3_4.graduationproject;

import java.util.Arrays;

public class Bookshelf {
    private int capacity = 10;
    private int countBooks;
    private Book[] books;
    private int size;

    public Bookshelf() {
        this.books = new Book[capacity];
        this.size = 0;
    }

    public void add(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Книга не может быть null");

        }
        if (size >= books.length) {
            throw new ArrayIndexOutOfBoundsException("Шкаф переполнен.");

        }
        books[size] = book;
        size++;
    }

    public Book[] find(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Название для поиска не может быть пустым");
        }
        Book[] found = new Book[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title.trim())) {
                found[counter++] = books[i];
            }
        }
        return Arrays.copyOf(found, counter);
    }

    public boolean remove(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Название для удаления не может быть пустым");
        }
        boolean removed = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title.trim())) {
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[size] = null;
                size--;
                removed = true;
            }
        }
        return removed;
    }

    public Book[] getAllBook() {
        return Arrays.copyOf(books, size);
    }

    public int getBookCount() {
        return size;
    }

    public int getFreeShelves() {
        return books.length - size;
    }

    public void clear() {
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
        size = 0;
    }

}

