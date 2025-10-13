package com.startjava.lesson_2_3_4.graduation;

import com.startjava.lesson_2_3_4.graduation.exception.InvalidMenuChoiceException;

public enum MenuItem {

    ADD(1, "Добавить книгу"),
    FIND(2, "Найти книгу"),
    REMOVE(3, "Удалить книгу"),
    CLEAR(4, "Очистить шкаф"),
    EXIT(5, "Завершить");

    private final String description;
    private final int menuNumber;

    MenuItem(int menuNumber, String description) {
        this.description = description;
        this.menuNumber = menuNumber;
    }

    public int getNumber() {
        return menuNumber;
    }

    public static MenuItem inputNumberMenu(int number) {
        if (number < 1 || number > values().length) {
            throw new InvalidMenuChoiceException("Ошибка: Неверное значение меню (" +
                    number + "). Допустимые значения: 1 - " + values().length);
        }
        return values()[number - 1];
    }

    @Override
    public String toString() {
        return (menuNumber + ". " + description);
    }
}
