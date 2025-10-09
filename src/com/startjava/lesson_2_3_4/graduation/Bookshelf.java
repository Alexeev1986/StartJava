package com.startjava.lesson_2_3_4.graduation;

import java.util.Arrays;

public class Bookshelf {

    public static final int CAPACITY = 10;
    private final Book[] books;
    private int maxLength;
    private int size;

    public Bookshelf() {
        this.books = new Book[CAPACITY];
    }

    public Book[] getAllBook() {
        return Arrays.copyOf(books, size);
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
        maxLength = Math.max(maxLength, books[size].getTextLength());
        size++;
        return true;
    }

    public int getBookCount() {
        return size;
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
        boolean isMaxLength;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title.trim())) {
                isMaxLength = (books[i].getTextLength() == maxLength);
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[size] = null;
                size--;
                if (isMaxLength) {
                    calculateLengthShelf();
                }
                return true;
            }
        }
        return false;
    }

    private void calculateLengthShelf() {
        maxLength = 0;
        for (int i = 0; i < size; i++) {
            maxLength = Math.max(maxLength, books[i].getTextLength());
        }
    }

    public int getmaxLength() {
        return maxLength;
    }

    public int countFreeShelves() {
        return CAPACITY - size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(books, 0, size, null);
        size = 0;
    }
}
