package com.startjava.lesson_2_3_4.graduation;

import com.startjava.lesson_2_3_4.graduation.exception.BookshelfFullException;
import com.startjava.lesson_2_3_4.graduation.exception.NotExistBookException;
import com.startjava.lesson_2_3_4.graduation.exception.IllegalMenuNumberException;
import java.util.Scanner;

public class BookshelfTest {

    private static final Scanner console = new Scanner(System.in);
    private static final Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) throws InterruptedException {
        printTypewriterEffect("Вас приветствует программа книжный шкаф.");
        initTestBooks();
        while (true) {
            MenuItem selectedItem;
            showMenu();
            selectedItem = inputMenuItem();
            execMenuItem(selectedItem);
            if (selectedItem == MenuItem.EXIT) {
                break;
            }
            displayShelf();
            waitEnter();
        }
    }

    private static void printTypewriterEffect(String text) throws InterruptedException {
        System.out.println();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(50);
        }
        System.out.println();
    }

    private static void initTestBooks() {
        Book book1 = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        Book book2 = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        Book book3 = new Book("Кэти Сьерра и Берт Бейтс", "Изучаем JAVA", 2022);
        Book book4 = new Book("Ли Бардуго", "Продажное королевство", 2020);
        Book book5 = new Book("Лия Арден", "Невеста ноября", 2025);
        Book book6 = new Book("Мари Нихофф", "Когда Король Падет", 2024);
        Book book7 = new Book("Робин Хобб", "Ученик убийцы", 2019);
        Book book8 = new Book("Пирс Браун", "Красное восстание", 2020);
        Book book9 = new Book("Ли Бардуго", "Продажное королевство", 2020);
        try {
            bookshelf.add(book1);
            bookshelf.add(book2);
            bookshelf.add(book3);
            bookshelf.add(book4);
            bookshelf.add(book5);
            bookshelf.add(book6);
            bookshelf.add(book7);
            bookshelf.add(book8);
            bookshelf.add(book9);
        } catch (BookshelfFullException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showMenu() {
        System.out.println();
        if (bookshelf.getBookCount() == 0) {
            System.out.println("Выберите желаемую операцию:");
            System.out.println(MenuItem.ADD.getNumber() + ". " + MenuItem.ADD.getDescription());
            System.out.println((MenuItem.EXIT.getNumber() - 3) + ". " + MenuItem.EXIT.getDescription());
        } else if (bookshelf.countFreeShelves() == 0) {
            System.out.println("Выберите желаемую операцию:");
            System.out.println((MenuItem.FIND.getNumber() - 1) + ". "  + MenuItem.FIND.getDescription());
            System.out.println((MenuItem.REMOVE.getNumber() - 1) + ". " + MenuItem.REMOVE.getDescription());
            System.out.println((MenuItem.CLEAR.getNumber() - 1) + ". " + MenuItem.CLEAR.getDescription());
            System.out.println((MenuItem.EXIT.getNumber() - 1) + ". " + MenuItem.EXIT.getDescription());
        } else {
            System.out.println("Выберите желаемую операцию:");
            for (MenuItem menuItem : MenuItem.values()) {
                System.out.println(menuItem);
            }
        }
    }

    private static MenuItem inputMenuItem() {
        while (true) {
            try {
                int inputNum = Integer.parseInt(console.nextLine().trim());
                if (bookshelf.getBookCount() == 0) {
                    return switch (inputNum) {
                        case 1 -> MenuItem.ADD;
                        case 2 -> MenuItem.EXIT;
                        default -> throw new IllegalMenuNumberException("Ошибка: Неверное значение меню (" +
                                inputNum + "). Допустимые значения: 1 - 2");
                    };
                } else if (bookshelf.countFreeShelves() == 0) {
                    if (inputNum < 1 || inputNum > 4) {
                        throw new IllegalMenuNumberException("Ошибка: Неверное значение меню (" +
                                inputNum + "). Допустимые значения: 1 - 4");
                    }
                    return MenuItem.numberMenu(inputNum + 1);
                } else {
                    return MenuItem.numberMenu(inputNum);
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введенное значения не является целым числом.");
            } catch (IllegalMenuNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void execMenuItem(MenuItem selectedItem) {
        if (selectedItem == null) {
            return;
        }
        switch (selectedItem) {
            case ADD -> addBook();
            case FIND -> findBook();
            case REMOVE -> removeBook();
            case CLEAR -> clearShelf();
            case EXIT -> {
                System.out.println("Выход");
                waitEnter();
            }
            default -> System.out.println("Ошибка: команды " +
                    selectedItem + "не существует.");
        }
    }

    private static void addBook() {
        System.out.println("Введите автора:");
        String author = inputString();
        System.out.println("Введите название книги:");
        String title = inputString();
        System.out.println("Введите год издания:");
        int year = inputYear();
        try {
            Book book = new Book(author, title, year);
            if (bookshelf.add(book)) {
                System.out.println("Книга добавлена.");
            }
        } catch (BookshelfFullException | IllegalArgumentException e) {
            System.out.println("Ошибка:" + e.getMessage());
        }
    }

    private static int inputYear() {
        while (true) {
            try {
                return Integer.parseInt(console.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: год должен быть целым числом.");
            }
        }
    }

    private static void findBook() {
        System.out.println("Введите название книги для поиска:");
        String title = inputString();
        Book[] found = bookshelf.find(title);
        if (found.length > 0) {
            for (Book foundBook : found) {
                System.out.println("Найдена книга: " + foundBook);
            }
        } else {
            System.out.println("Книга с таким названием не найдена.");
        }
    }

    private static String inputString() {
        while (true) {
            String input = console.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Ошибка: значение не может быть пустым, повторите ввод:");
        }
    }

    private static void removeBook() {
        System.out.println("Введите название книги для удаления:");
        String title = console.nextLine();
        try {
            int result = bookshelf.remove(title);
            if (result > 0) {
                System.out.println("Удалено: " + result + " " +
                        (result == 1 ? "книга" : "книги"));
            }
        } catch (NotExistBookException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void clearShelf() {
        bookshelf.clear();
        System.out.println("Шкаф очищен");
    }

    private static void waitEnter() {
        String input;
        do {
            System.out.println("\nДля продолжения работы нажмите клавишу <Enter>");
            input = console.nextLine();
        } while (!input.isBlank());
    }

    private static void displayShelf() {
        System.out.printf("В шкафу книг - %d, свободно полок - %d%n%n",
                bookshelf.getBookCount(), bookshelf.countFreeShelves());
        if (bookshelf.isEmpty()) {
            System.out.println("Шкаф пуст вы можете добавить в него первую книгу.");
            return;
        }
        int length = bookshelf.getMaxLength();
        Book[] books = bookshelf.getAllBook();
        for (Book book : books) {
            System.out.printf("|%-" + length + "s|%n", book);
            System.out.printf("|%s|%n", "-".repeat(length));
        }

        for (int i = bookshelf.getBookCount(); i < Bookshelf.CAPACITY; i++) {
            System.out.println("|" + " ".repeat(length) + "|");
            if (i < Bookshelf.CAPACITY - 1) {
                System.out.println("|" + "-".repeat(length) + "|");
            }
        }
    }
}