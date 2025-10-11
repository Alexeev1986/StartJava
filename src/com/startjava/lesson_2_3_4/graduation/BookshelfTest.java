package com.startjava.lesson_2_3_4.graduation;

import com.startjava.lesson_2_3_4.graduation.exception.BookAddException;
import com.startjava.lesson_2_3_4.graduation.exception.BookRemoveException;
import com.startjava.lesson_2_3_4.graduation.exception.InvalidMenuChoiceException;
import java.util.Scanner;

public class BookshelfTest {

    private static final Scanner console = new Scanner(System.in);
    private static final Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) throws InterruptedException {
        printTypewriterEffect("Вас приветствует программа книжный шкаф.");
        initTestBooks();
        displayShelf();
        MenuChoice selectedItem;
        while (true) {
            showMenu();
            selectedItem = inputMenuItem();
            execMenuItem(selectedItem);
            if (selectedItem == MenuChoice.EXIT) {
                break;
            }
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
        } catch (BookAddException e) {
            System.out.println(e.getMessage());
        }
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

        for (int i = bookshelf.getBookCount(); i < bookshelf.CAPACITY; i++) {
            System.out.println("|" + " ".repeat(length) + "|");
            if (i < bookshelf.CAPACITY - 1) {
                System.out.println("|" + "-".repeat(length) + "|");
            }
        }
    }

    private static void showMenu() {
        System.out.println();
        if (bookshelf.getBookCount() == 0) {
            System.out.println("""
                    Выберите желаемую операцию:
                    1. Добавить книгу
                    2. Завершить""");
        } else if (bookshelf.getFreeShelves() == 0) {
            System.out.println("""
                    Выберите желаемую операцию:
                    1. Найти книгу по названию
                    2. Удалить книгу по названию
                    3. Очистить шкаф
                    4. Завершить""");
        } else {
            System.out.println("Выберите желаемую операцию:");
            for (MenuChoice menuChoice : MenuChoice.values()) {
                System.out.println(menuChoice);
            }
        }
    }

    private static MenuChoice inputMenuItem() {
        try {
            int inputNum = Integer.parseInt(console.nextLine());
            if (bookshelf.getBookCount() == 0) {
                return switch (inputNum) {
                    case 1 -> MenuChoice.ADD;
                    case 2 -> MenuChoice.EXIT;
                    default -> throw new InvalidMenuChoiceException("Ошибке: " +
                            "нет такого пункта меню " + inputNum);
                };
            } else if (bookshelf.getFreeShelves() == 0) {
                return switch (inputNum) {
                    case 1 -> MenuChoice.FIND;
                    case 2 -> MenuChoice.REMOVE;
                    case 3 -> MenuChoice.CLEAR;
                    case 4 -> MenuChoice.EXIT;
                    default -> throw new InvalidMenuChoiceException("Ошибке:" +
                            " нет такого пункта меню " + inputNum);
                };
            } else {
                return MenuChoice.inputNumberMenu(inputNum);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенное значения не является целым числом.");
        } catch (InvalidMenuChoiceException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static void execMenuItem(MenuChoice option) {
        if (option == null) {
            return;
        }
        switch (option) {
            case ADD -> addBook();
            case FIND -> findBook();
            case REMOVE -> removeBook();
            case CLEAR -> clearShelf();
            case EXIT -> {
                System.out.println("Выход");
                waitEnter();
            }
            default -> System.out.println("Ошибка: команды " +
                    option + "не существует.");
        }
    }

    private static void waitEnter() {
        String input;
        do {
            System.out.println("\nДля продолжения работы нажмите клавишу <Enter>");
            input = console.nextLine();
        } while (!input.isBlank());
    }

    private static void addBook() {
        System.out.println("Введите автора:");
        String author = inputString();
        System.out.println("введите название книги:");
        String title = inputString();
        System.out.println("Введите год издания:");
        int year = inputYear();
        try {
            Book book = new Book(author, title, year);
            if (bookshelf.add(book)) {
                System.out.println("Книга добавлена.");
                displayShelf();
            }
        } catch (BookAddException e) {
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
            System.out.println("книга с таким названием не найдена.");
        }
        displayShelf();
    }

    private static void removeBook() {
        System.out.println("Введите название книги для удаления:");
        String title = inputString();
        try {
            if (bookshelf.remove(title)) {
                System.out.println("Книга успешно удалена");
                displayShelf();
            }
        } catch (BookRemoveException e) {
            System.out.println(e.getMessage());
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

    private static void clearShelf() {
        bookshelf.clear();
        System.out.println("Шкаф очищен");
        displayShelf();
    }
}