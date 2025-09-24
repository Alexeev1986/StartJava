package com.startjava.lesson_2_3_4.graduation;

import java.util.Arrays;

public class Bookshelf {

    private int capacity = 10;
    private Book[] books;
    private int size;

    public Bookshelf() {
        this.books = new Book[capacity];
        this.size = 0;
    }

    public boolean add(Book book) {
        if (size >= books.length) {
            return false;
        }
        books[size] = book;
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
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title.trim())) {
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[size] = null;
                size--;
                i--;
                return true;
            }
        }
        return false;
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

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateWidthShelf() {
        int maxWidth = 0;
        for (int i = 0; i < size;i++) {
            if (maxWidth < books[i].getLength()) {
                maxWidth = books[i].getLength();
            }
        }
        return maxWidth;
    }
}

