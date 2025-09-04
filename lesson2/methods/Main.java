package lesson2.methods;

public class Main {
    public static void main(String[] args) {
        System.out.println("Не BOOLEAN - методы");
        NonBooleanMethods nonBool = new NonBooleanMethods();
        nonBool.findLongestWord();
        nonBool.selectMenuItem();
        nonBool.calculateAverageGrades();
        nonBool.countedUniqueWords();
        nonBool.printErrorMessage();
        nonBool.syncCloudStorage();
        nonBool.restoreDataBackup();
        nonBool.pauseDownloadingMp3();
        nonBool.resetFactorySettings();
        nonBool.writeToFile();
        nonBool.convertCelsiusToFahrenheit();
        nonBool.enterMathematicalExpression();
        nonBool.placeWinner();
        nonBool.findBookByAuthor();

        System.out.println("BOOLEAN - методы");
        BooleanMethods bool = new BooleanMethods();
        System.out.println(bool.isContinue());
        System.out.println(bool.isUniqueNumber());
        System.out.println(bool.isLatter());
        System.out.println(bool.isNumber());
        System.out.println(bool.isThereAttempts());
        System.out.println(bool.isEmptylineOrSpaces());
        System.out.println(bool.isEvenNumber());
        System.out.println(bool.isVailedPath());
        System.out.println(bool.isExistFile());
    }
}
