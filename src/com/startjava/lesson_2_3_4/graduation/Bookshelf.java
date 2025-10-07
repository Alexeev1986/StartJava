package com.startjava.lesson_2_3_4.graduation;

import java.util.Arrays;

public class Bookshelf {

    public final int capacity = 10;
    private final Book[] books;
    public int maxWidth;
    private int size;

    public Bookshelf() {
        this.books = new Book[capacity];
    }

    public Book[] getAllBook() {
        return Arrays.copyOf(books, size);
    }

    public int countFreeShelves() {
        return books.length - size;
    }

    public boolean add(Book book) {
        if (book == null) {
            return false;
        }
        if (size >= books.length) {
            System.out.println("Ошибка: шкаф заполнен.");
            return false;
        }
        books[size] = book;
        size++;
        calculateWidthShelf();
        return true;
    }

    private void calculateWidthShelf() {
        maxWidth = 0;
        for (int i = 0; i < size; i++) {
            maxWidth = Math.max(maxWidth, books[i].getTextLength());
        }
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
                calculateWidthShelf();
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getBookCount() {
        return size;
    }

    public void clear() {
        Arrays.fill(books, 0, size, null);
        size = 0;
    }
}

