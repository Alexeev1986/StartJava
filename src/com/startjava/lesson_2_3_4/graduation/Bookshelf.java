package com.startjava.lesson_2_3_4.graduation;

import java.util.Arrays;

public class Bookshelf {

    public static final int CAPACITY = 10;
    private final Book[] books;
    public int maxWidth;
    private int size;

    public Bookshelf() {
        this.books = new Book[CAPACITY];
    }

    public Book[] getAllBook() {
        return Arrays.copyOf(books, size);
    }

    public int countFreeShelves() {
        return CAPACITY - size;
    }

    public boolean add(Book book) {
        if (book == null) {
            return false;
        }
        if (size >= CAPACITY) {
            System.out.println("Ошибка: шкаф заполнен.");
            return false;
        }
        books[size] = book;
        if (books[size].getTextLength() > maxWidth) {
            maxWidth = books[size].getTextLength();
        }
        size++;
        return true;
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
        boolean isLanger;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title.trim())) {
                isLanger = (books[i].getTextLength() == maxWidth);
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[size] = null;
                size--;
                if (isLanger) {
                    calculateWidthShelf();
                }
                return true;
            }
        }
        return false;
    }

    private void calculateWidthShelf() {
        maxWidth = 0;
        for (int i = 0; i < size; i++) {
            maxWidth = Math.max(maxWidth, books[i].getTextLength());
        }
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

