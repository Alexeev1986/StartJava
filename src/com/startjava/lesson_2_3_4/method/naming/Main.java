package com.startjava.lesson_2_3_4.method.naming;

public class Main {
    public static void main(String[] args) {
        System.out.println("Не BOOLEAN - методы");
        doNonBm();
        System.out.println("BOOLEAN - методы");
        doBm();
    }

    static void doNonBm() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.selectMenuItem();
        nonBm.calculateAverageGrades();
        nonBm.countUniqueWords();
        nonBm.printErrorMessage();
        nonBm.syncCloudStorage();
        nonBm.restoreDataBackup();
        nonBm.pauseDownloading();
        nonBm.resetFactorySettings();
        nonBm.writeToFile();
        nonBm.convertCelsiusToFahrenheit();
        nonBm.inputMathExpr();
        nonBm.determineWinner();
        nonBm.findBookByAuthor();
    }

    static void doBm() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isContinue());
        System.out.println(bm.isUniqueNumber());
        System.out.println(bm.isLatter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttempts());
        System.out.println(bm.isBlank());
        System.out.println(bm.isEvenNumber());
        System.out.println(bm.isVailedPath());
        System.out.println(bm.isExistFile());
    }
}
