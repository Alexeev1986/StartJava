import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.printf("%n1. Вывод характеристик компьютера.%n%n");
        // имеется в наличии
        boolean available = true;

        // количество ядер
        byte coreCount = 4;

        // объем оперативной памяти
        short ramCapacity = 8;

        // объем жесткого диска
        int hddCapacity = 1024;

        // объем твердотельного диска
        long sddCapacity = 512;

        // единица измерения памяти
        char memoryUnitSize = 'G';

        // количество операций в секунду
        float operationsInSec = 8945236.5F;

        // цена изделия
        double productPrice = 13549.99;

        System.out.println("имеется в наличии: " + available);
        System.out.println("количество ядер = " + coreCount);
        System.out.println("объем оперативной памяти = " + ramCapacity + memoryUnitSize);
        System.out.println("объем жесткого диска = " + hddCapacity + memoryUnitSize);
        System.out.println("объем твердотельного диска = " + hddCapacity + memoryUnitSize);
        System.out.println("количество операций в секунду = " + operationsInSec);
        System.out.println("цена изделия = " + productPrice);

        System.out.printf("%n2. Расчет стоимости товара со скидкой.%n%n");

        double penPrice = 105.5;
        double bookPrice = 235.83;
        int discount = 11;
        double basePrice = penPrice + bookPrice;
        double discountAmount = (basePrice / 100) * discount;
        double discountPrice = basePrice - discountAmount;
        System.out.println("Стоимость товара без скидки = " + String.format("%.2f", basePrice));
        System.out.println("Сумма скидки = " + String.format("%.2f", discountAmount));
        System.out.println("Стоимость товара со скидкой = " + String.format("%.2f", discountPrice));

        System.out.printf("%n3. Вывод слова JAVA.%n%n");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  v v  aaaaa ");
        System.out.println(" JJ  a     a  v  a     a");

        System.out.printf("%n4. Вывод min и max значений целых числовых типов.%n%n");

        byte byteValue = 127;
        System.out.printf("%n Переменная типа byte: первоначальное значение = " + byteValue);
        byteValue++;
        System.out.printf("%n значение после инкремента = " + byteValue);
        byteValue--;
        System.out.printf("%n значение после декремента = " + byteValue + "%n");

        short shortValue = 32767;
        System.out.printf("%n Переменная типа short: первоначальное значение = " + shortValue);
        shortValue++;
        System.out.printf("%n значение после инкремента = " + shortValue);
        shortValue--;
        System.out.printf("%n значение после декремента = " + shortValue + "%n");

        int intValue = 2147483647;
        System.out.printf("%n Переменная типа int: первоначальное значение = " + intValue);
        intValue++;
        System.out.printf("%n значение после инкремента = " + intValue);
        intValue--;
        System.out.printf("%n значение после декремента = " + intValue + "%n");

        Long longValue = 9223372036854775807L;
        System.out.printf("%n Переменная типа Long: первоначальное значение = " + longValue);
        longValue++;
        System.out.printf("%n значение после инкремента = " + longValue);
        longValue--;
        System.out.printf("%n значение после декремента = " + longValue + "%n");

        char charValue = 65535;
        System.out.printf("%n Переменная типа Char: первоначальное значение = " + (int) charValue);
        charValue++;
        System.out.printf("%n значение после инкремента = " + (int) charValue);
        charValue--;
        System.out.printf("%n значение после декремента = " + (int) charValue + "%n");

        System.out.printf("%n5. Перестановка значений переменных.%n%n");

        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения: X = " + num1 + " ; Y = " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Обмен значений с помощью третьей переменной:X = " + num1 + " ; Y = " + num2);
        num1 += num2; 
        num2 = num1 - num2; 
        num1 -= num2;
        System.out.println("Обмен значений с помощью арифметических операций:X = " + num1 + " ; Y = " + num2);
        num1 ^= num2; 
        num2 = num2 ^ num1; 
        num1 ^= num2;
        System.out.println("Обмен значений с помощью побитовой операции:X = " + num1 + " ; Y = " + num2);

        System.out.printf("%n6. Вывод символов и их кодов.%n%n");

        char dollar = 36;
        char asterisk = 42;
        char atsign = 64;
        char circumflex = 94;
        char tilde = 126;
        System.out.printf("%n Код символа - " + (int) dollar + "\t" + " ; Символ -" + dollar);
        System.out.printf("%n Код символа - " + (int) asterisk + "\t" + " ; Символ -" + asterisk);
        System.out.printf("%n Код символа - " + (int) atsign + "\t" + " ; Символ -" + atsign);
        System.out.printf("%n Код символа - " + (int) circumflex + "\t" + " ; Символ -" + circumflex);
        System.out.printf("%n Код символа - " + (int) tilde + "\t" + " ; Символ -" + tilde + "%n");

        System.out.printf("%n7. Вывод в консоль ASCII-арт Дюка.%n%n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftparenthesis = '(';
        char rightparenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftparenthesis + " " + rightparenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + "" + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.printf("%n8. Манипуляции с сотнями, десятками и единицами числа.%n%n");

        int number = 123;
        int hundredNumber = number / 100;
        int tenNumber = (number % 100) / 10;
        int onesNumber = number % 10;
        int digitSum = tenNumber + hundredNumber + onesNumber;
        int digitProduct = tenNumber * hundredNumber * onesNumber;
        System.out.println("Число " + number + " содержит:");
        System.out.println("сотен - " + hundredNumber);
        System.out.println("десятков - " + tenNumber);
        System.out.println("единиц - " + onesNumber);
        System.out.println("сумма разрядов = " + digitSum);
        System.out.println("произведение разрядов = " + digitProduct);

        System.out.printf("%n9. Перевод секунд в часы, минуты и секунды.%n%n");

        int allSec = 86399;
        int hh = allSec / 3600;
        int mm = (allSec % 3600) / 60;
        int ss = allSec % 60;
        
        System.out.println("Количество секунд = " + allSec);
        System.out.println(hh + ":" + mm + ":" + ss);

        System.out.printf("%n10. Расчет стоимости товара со скидкой.%n%n");

        BigDecimal penPriceBd = new BigDecimal("105.5");
        BigDecimal bookPriceBd = new BigDecimal("235.83");
        BigDecimal discountBd = new BigDecimal("0.11");

        BigDecimal basePriceBd = penPriceBd.add(bookPriceBd);
        
        BigDecimal discountAmountBd = basePriceBd.multiply(discountBd).setScale(2, RoundingMode.HALF_UP);

        BigDecimal discountPriceBd = basePriceBd.subtract(discountAmountBd);

        System.out.println("Стоимость товара без скидки = " + basePriceBd);
        System.out.println("Сумма скидки = " + discountAmountBd);
        System.out.println("Стоимость товара со скидкой = " + discountPriceBd);
    }
}