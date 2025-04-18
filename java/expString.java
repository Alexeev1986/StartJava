import java.nio.charset.Charset;

public class expString {
    public static void main(String[] args) {
        // 1. Создание строки с помощью литерала
        String habr = "habrahabr";
        System.out.println(habr);  // Вывод: habrahabr

        // 2. Создание массива символов
        char[] habrAsArrayOfChars = {'h', 'a', 'b', 'r', 'a', 'h', 'a', 'b', 'r'};

        // 3. Создание массива байтов
        byte[] habrAsArrayOfBytes = {104, 97, 98, 114, 97, 104, 97, 98, 114}; // ASCII-коды для "habrahabr"

        // 4. Создание пустой строки
        String first = new String();
        System.out.println(first);  // Вывод: (пустая строка)

        // 5. Создание строки на основе другой строки
        String second = new String(habr);
        System.out.println(second);  // Вывод: habrahabr

        // 6. Создание строки из массива символов
        String third = new String(habrAsArrayOfChars);
        System.out.println(third);  // Вывод: habrahabr

        // 7. Создание строки из части массива байтов
        String fourth = new String(habrAsArrayOfBytes, 0, 4); // Первые 4 байта
        System.out.println(fourth);  // Вывод: habr

        // 8. Создание строки из массива байтов с указанием кодировки
        String fifth = new String(habrAsArrayOfBytes, Charset.forName("UTF-8"));
        System.out.println(fifth);  // Вывод: habrahabr

        // 9. Создание строки из объекта StringBuffer
        String sixth = new String(new StringBuffer(habr));
        System.out.println(sixth);  // Вывод: habrahabr

        // 10. Создание строки из объекта StringBuilder
        String seventh = new String(new StringBuilder(habr));
        System.out.println(seventh);  // Вывод: habrahabr
    }
}