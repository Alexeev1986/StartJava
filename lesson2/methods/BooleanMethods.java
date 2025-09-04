package lesson2.methods;

public class BooleanMethods {

    public boolean isContinue() {
        System.out.print(Methods.getCallingMethodName() +
                "() -> программа выполняется далее или завершается ");
        return true;
    }

    public boolean isUniqueNumber() {
        System.out.print(Methods.getCallingMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }
    public boolean isLatter() {
        System.out.print(Methods.getCallingMethodName() +
                "() -> пользователь ввел букву или что-то другое ");
        return true;
    }

    public boolean isNumber() {
        System.out.print(Methods.getCallingMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean isThereAttempts() {
        System.out.print(Methods.getCallingMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isEmptylineOrSpaces() {
        System.out.print(Methods.getCallingMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.print(Methods.getCallingMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isVailedPath() {
        System.out.print(Methods.getCallingMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isExistFile() {
        System.out.print(Methods.getCallingMethodName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}
