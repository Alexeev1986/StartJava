package com.startjava.lesson_2_3_4.graduation;

import com.startjava.lesson_2_3_4.graduation.exception.BookAddException;
import com.startjava.lesson_2_3_4.graduation.exception.BookRemoveException;
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

    public boolean add(Book book) throws BookAddException {
        if (book == null) {
            return false;
        }
        if (size >= CAPACITY) {
            throw new BookAddException("Ошибка: полный шкаф.");
        }
        books[size] = book;
        maxLength = Math.max(maxLength, books[size].getTextLength());
        size++;
        return true;
    }

    public int getBookCount() {
        return size;
    }

    public int getFreeShelves() {
        return books.length - size;
    }

    public Book[] find(String title) {
        if (title == null || title.isBlank()) {
            return null;
        }
        Book[] found = new Book[2];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title.trim())) {
                if (counter >= found.length) {
                    found = Arrays.copyOf(found, found.length * 2);
                }
                found[counter++] = books[i];
            }
        }
        return Arrays.copyOf(found, counter);
    }

    public boolean remove(String title) throws BookRemoveException {
        if (title == null || title.isBlank()) {
            return false;
        }
        boolean isMaxLength;
        boolean isRemove = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title.trim())) {
                isMaxLength = (books[i].getTextLength() == maxLength);
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                if (size != 10) {
                    books[size] = null;
                }
                size--;
                i--;
                if (isMaxLength) {
                    calculateLengthShelf();
                }
                isRemove = true;
            }
        }
        if (isRemove) {
            return true;
        }
        throw new BookRemoveException("Ошибка: книга " + title + " не найдена");
    }

    private void calculateLengthShelf() {
        maxLength = 0;
        for (int i = 0; i < size; i++) {
            maxLength = Math.max(maxLength, books[i].getTextLength());
        }
    }

    public int getMaxLength() {
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
