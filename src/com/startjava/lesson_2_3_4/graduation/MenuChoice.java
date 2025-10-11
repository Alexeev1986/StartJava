package com.startjava.lesson_2_3_4.graduation;

import com.startjava.lesson_2_3_4.graduation.exception.InvalidMenuChoiceException;

public enum MenuChoice {

    ADD(1, "Добавить книгу"),
    FIND(2, "Найти книгу"),
    REMOVE(3, "Удалить книгу"),
    CLEAR(4, "Очистить шкаф"),
    EXIT(5, "Завершить");

    private final String description;
    private final int numberMenu;

    MenuChoice(int numberMenu, String description) {
        this.description = description;
        this.numberMenu = numberMenu;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return numberMenu;
    }

    public static MenuChoice inputNumberMenu(int number) throws InvalidMenuChoiceException {
        for (MenuChoice menuCommand : values()) {
            if (menuCommand.getNumber() == number) {
                return menuCommand;
            }
        }
        throw new InvalidMenuChoiceException("Ошибке: нет такого пункта меню " + number);
    }

    @Override
    public String toString() {
        return (numberMenu + ". " + description);
    }
}
