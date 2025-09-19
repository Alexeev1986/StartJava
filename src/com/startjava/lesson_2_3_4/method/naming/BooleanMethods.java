package com.startjava.lesson_2_3_4.method.naming;

public class BooleanMethods {
    public boolean isContinue() {
        System.out.print(Methods.getCurrName() +
                "() -> программа выполняется далее или завершается ");
        return true;
    }

    public boolean isUniqueNumber() {
        System.out.print(Methods.getCurrName() +
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }
    
    public boolean isLatter() {
        System.out.print(Methods.getCurrName() +
                "() -> пользователь ввел букву или что-то другое ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(Methods.getCurrName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasAttempts() {
        System.out.print(Methods.getCurrName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isBlank() {
        System.out.print(Methods.getCurrName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.print(Methods.getCurrName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isVailedPath() {
        System.out.print(Methods.getCurrName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isExistFile() {
        System.out.print(Methods.getCurrName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}
