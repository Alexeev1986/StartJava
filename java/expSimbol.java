
public class expSimbol {
    public static void main(String[] args) {
         // Задание 5
        System.out.printf("%nЗадание №5 Определение символа по его коду.%n%n");

        char symbol = '%';
        if (Character.isUpperCase(symbol)) {
            System.out.println(symbol + " - большая буква");
        } else if (Character.isLetter(symbol)) {
            System.out.println(symbol + " - маленькая буква");
        } else if (Character.isDigit(symbol) | Character.isUpperCase(symbol)) {
            System.out.println(symbol + " - это число");
        } else {
            System.out.println(symbol + " - это иной символ");
        }
    }
}
