package com.startjava.lesson_2_3_4.graduation;

import java.util.Random;
import java.util.Scanner;

public class BookshelfTest {

    private static final Scanner CONSOLE = new Scanner(System.in);
    private static final Bookshelf BOOKSHELF = new Bookshelf();

    public static void main(String[] args) throws InterruptedException {
        printTypewriterEffect("Вас приветствует программа книжный шкаф.");
        addingTestBooks();
        while (true) {
            showMenu();
            executionMenuItem(inputMenuItem());
            waitEnter();
        }
    }

    private static void addingTestBooks() {
        Book book1 = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        Book book2 = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        Book book3 = new Book("Кэти Сьерра и Берт Бейтс", "Изучаем JAVA", 2022);
        Book book4 = new Book("Ли Бардуго", "Продажное королевство", 2020);
        Book book5 = new Book("Лия Арден", "Невеста ноября", 2025);
        Book book6 = new Book("Мари Нихофф", "Когда Король Падет", 2024);
        Book book7 = new Book("Робин Хобб", "Ученик убийцы", 2019);
        Book book8 = new Book("Пирс Браун", "Красное восстание", 2020);
        Book book9 = new Book("Ханна Гриффин", "Последний закат Элиона", 2024);
        BOOKSHELF.add(book1);
        BOOKSHELF.add(book2);
        BOOKSHELF.add(book3);
        BOOKSHELF.add(book4);
        BOOKSHELF.add(book5);
        BOOKSHELF.add(book6);
        BOOKSHELF.add(book7);
        BOOKSHELF.add(book8);
        BOOKSHELF.add(book9);
    }

    private static void addBook() {
        System.out.println("Введите автора:");
        String author = inputString();
        System.out.println("введите название книги:");
        String title = inputString();
        System.out.println("Введите год издания:");
        int year = readYear();
        try {
            Book book = new Book(author, title, year);
            if (BOOKSHELF.add(book)) {
                System.out.println("Книга добавлена.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка:" + e.getMessage());
        }
    }

    private static void clearShelf() {
        BOOKSHELF.clear();
        System.out.println("Шкаф очищен");
    }

    private static void displayShelf() {
        System.out.printf("В шкафу книг - %d, свободно полок - %d%n%n",
                BOOKSHELF.getBookCount(), BOOKSHELF.countFreeShelves());
        if (BOOKSHELF.isEmpty()) {
            System.out.println("Шкаф пуст вы можете добавить в него первую книгу.");
            return;
        }
        int width = BOOKSHELF.maxWidth;
        Book[] books = BOOKSHELF.getAllBook();
        for (Book book : books) {
            System.out.printf("|%-" + width + "s|%n", book);
            System.out.printf("|%s|%n", "-".repeat(width));
        }

        for (int i = BOOKSHELF.getBookCount(); i < BOOKSHELF.capacity; i++) {
            System.out.println("|" + " ".repeat(width) + "|");
            if (i < BOOKSHELF.capacity - 1) {
                System.out.println("|" + "-".repeat(width) + "|");
            }
        }
    }

    private static void findBook() {
        System.out.println("Введите название книги для поиска:");
        String title = inputString();
        Book found = BOOKSHELF.find(title);
        if (found != null) {
            System.out.println("Найдена книга: " + found);
        } else {
            System.out.println("книга с таким названием не найдена.");
        }
    }

    private static void removeBook() {
        System.out.println("Введите название книги для удаления:");
        String title = inputString();
        if (BOOKSHELF.remove(title)) {
            System.out.println("Книга успешно удалена");
        } else {
            System.out.println("Ошибка: книга с таким названием не найдена");
        }
    }

    private static int readYear() {
        while (true) {
            try {
                return Integer.parseInt(CONSOLE.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: год должен быть целым числом.");
            }
        }
    }

    private static void waitEnter() {
        System.out.println("\nДля продолжения работы нажмите клавишу <Enter>");
        CONSOLE.nextLine();
    }

    private static void showMenu() {
        System.out.println();
        String menu = """
                Выберите желаемую операцию:
                1. Добавить книгу
                2. Найти книгу по названию
                3. Удалить книгу по названию
                4. Показать шкаф
                5. Очистить шкаф
                0. Завершить""";
        System.out.println(menu);
    }

    private static int inputMenuItem() {
        try {
            return Integer.parseInt(CONSOLE.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенное значения не является числом.");
            waitEnter();
        }
        return 6;
    }

    private static void executionMenuItem(int inputConsole) {
        switch (inputConsole) {
            case 1 -> addBook();
            case 2 -> findBook();
            case 3 -> removeBook();
            case 4 -> displayShelf();
            case 5 -> clearShelf();
            case 0 -> {
                System.out.println("Выход");
                System.exit(0);
            }
            default -> System.out.println("Ошибка: не верное значение меню (" + inputConsole +
                    "). Допустимые значения: 0 - 5");
        }
    }

    private static String inputString() {
        while (true) {
            String input = CONSOLE.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Ошибка: значение не может быть пустым, повторите ввод:");
        }
    }

    private static void printTypewriterEffect(String text) throws InterruptedException {
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(random.nextInt(50, 100));
        }
        System.out.println();
    }
}