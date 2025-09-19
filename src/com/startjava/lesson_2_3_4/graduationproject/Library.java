package com.startjava.lesson_2_3_4.graduationproject;

public class Library {


    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Book book1 = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        Book book2 = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        Book book3 = new Book("Кэти Сьерра и Берт Бейтс", "Изучаем JAVA", 2022);
        Book book4 = new Book("Ли Бардуго", "Продажное королевство", 2020);
        Book book5 = new Book("Лия Арден", "Невеста ноября", 2025);
        Book book6 = new Book("Мари Нихофф", "Когда Король Падет", 2024);

        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book3);
        bookshelf.add(book4);
        bookshelf.add(book5);
        bookshelf.add(book6);


        System.out.println("Количество книг в шкафу = " + bookshelf.getBookCount());
        int counter = 1;
        for (Book temp : bookshelf.getAllBook()) {
            System.out.println(counter + " " + temp.toString());
            counter++;
        }
        System.out.println();
        Book[] findBook = bookshelf.find("Изучаем JAVA");
        System.out.println(findBook[0].toString());
        System.out.println();
        bookshelf.remove("Изучаем JAVA");

        counter = 1;
        for (Book temp : bookshelf.getAllBook()) {
            System.out.println(counter + " " + temp.toString());
            counter++;
        }


    }


}
