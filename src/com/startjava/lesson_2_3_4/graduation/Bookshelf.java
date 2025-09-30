package com.startjava.lesson_2_3_4.graduation;

import java.util.Arrays;

public class Bookshelf {

    public static final int CAPACITY = 10;
    private final Book[] books;
    private int size;

    public Bookshelf() {
        this.books = new Book[CAPACITY];
        this.size = 0;
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

    public boolean add(Book book) {
        if (book == null || size >= books.length) {
            return false;
        }
        books[size] = book;
        size++;
        return true;
    }

    public int calculateWidthShelf() {
        int maxWidth = 0;
        for (int i = 0; i < size; i++) {
            if (maxWidth < books[i].getDisplayWidth()) {
                maxWidth = books[i].getDisplayWidth();
            }
        }
        return maxWidth;
    }

    public void clear() {
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
        size = 0;
    }

    public Book find(String title) {
        if (title == null || title.isBlank()) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title.trim())) {
                return books[i];
            }
        }
        return null;
    }

    public boolean remove(String title) {
        if (title == null || title.isBlank()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title.trim())) {
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[size] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

