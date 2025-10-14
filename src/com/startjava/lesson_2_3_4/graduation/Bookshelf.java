package com.startjava.lesson_2_3_4.graduation;

import com.startjava.lesson_2_3_4.graduation.exception.BookshelfFullException;
import com.startjava.lesson_2_3_4.graduation.exception.NotExistBookException;
import java.util.Arrays;

public class Bookshelf {

    public static final int CAPACITY = 10;
    public static final int DEFAULT_CAPACITY_FOR_FIND = 2;
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
            throw new BookshelfFullException("Ошибка: в шкафу нет свободного места .");
        }
        books[size] = book;
        maxLength = Math.max(maxLength, books[size].getTextLength());
        size++;
        return true;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getBookCount() {
        return size;
    }

    public int countFreeShelves() {
        return CAPACITY - size;
    }

    public Book[] find(String title) {
        if (title == null || title.isBlank()) {
            return new Book[0];
        }
        Book[] found = new Book[DEFAULT_CAPACITY_FOR_FIND];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title.trim())) {
                if (count >= found.length) {
                    found = Arrays.copyOf(found, (int) Math.round(found.length * 1.5));
                }
                found[count++] = books[i];
            }
        }
        return Arrays.copyOf(found, count);
    }

    public int remove(String title) {
        if (title == null || title.isBlank()) {
            throw new NotExistBookException("Ошибка: не указано название удаляемой книги.");
        }
        boolean isMaxLength;
        int removed = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title.trim())) {
                isMaxLength = (books[i].getTextLength() == maxLength);
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[--size] = null;
                removed++;
                i--;
                if (isMaxLength) {
                    calculateLengthShelf();
                }
            }
        }
        if (removed > 0) {
            return removed;
        }
        System.out.println("Книга " + title + " не найдена");
        return removed;
    }

    private void calculateLengthShelf() {
        maxLength = 0;
        for (int i = 0; i < size; i++) {
            maxLength = Math.max(maxLength, books[i].getTextLength());
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(books, 0, size, null);
        size = 0;
    }
}
