import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        // -------------------------------------------------------------------------------------------
        System.out.printf("%n1. Вывод характеристик компьютера.%n%n");

        // имеется в наличии
        boolean available = true;

        // количество ядер
        byte coresCount = 4;

        // объем оперативной памяти
        short volumeRam = 8;

        // объем жесткого диска
        int volumeHdd = 1024;

        // объем твердотельного диска
        long volumeSdd = 512;

        // единица измерения памяти
        char memoryUnitSize = 'G';

        // количество операций в секунду
        float operationsInSec = 8945236.5F;

        // цена изделия
        double productPrice = 13549.99;

        System.out.println("имеется в наличии: " + available);
        System.out.println("количество ядер = " + coresCount);
        System.out.println("объем оперативной памяти = " + volumeRam + memoryUnitSize);
        System.out.println("объем жесткого диска = " + volumeHdd + memoryUnitSize);
        System.out.println("объем твердотельного диска = " + volumeSdd + memoryUnitSize);
        System.out.println("количество операций в секунду = " + operationsInSec);
        System.out.println("цена изделия = " + productPrice);

        // -------------------------------------------------------------------------------------------
        System.out.printf("%n2. Расчет стоимости товара со скидкой.%n%n");

        double penPrice = 105.5;
        double bookPrice = 235.83;
        int discount = 11;
        double sumOffDiscount = penPrice + bookPrice;
        double sumDiscount = (sumOffDiscount / 100) * discount;
        double sumOnDiscount = sumOffDiscount - sumDiscount;
        System.out.println("Стоимость товара без скидки = " + String.format("%.2f", sumOffDiscount));
        System.out.println("Сумма скидки = " + String.format("%.2f", sumDiscount));
        System.out.println("Стоимость товара со скидкой = " + String.format("%.2f", sumOnDiscount));

        // -------------------------------------------------------------------------------------------
        System.out.printf("%n3. Вывод слова JAVA.%n%n");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  v v  aaaaa ");
        System.out.println(" JJ  a     a  v  a     a");

        // -------------------------------------------------------------------------------------------
        System.out.printf("%n4. Вывод min и max значений целых числовых типов.%n%n");

        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        Long longVar = 9223372036854775807L;

        System.out.printf("%n Переменная типа byte: первоначальное значение =" + byteVar);
        System.out.printf("%n значение после инкремента = " + byteVar++);
        System.out.printf("%n значение после декремента =" + byteVar-- + "%n");

        System.out.printf("%n Переменная типа short: первоначальное значение =" + shortVar);
        System.out.printf("%n значение после инкремента = " + shortVar++);
        System.out.printf("%n значение после декремента =" + shortVar-- + "%n");

        System.out.printf("%n Переменная типа int: первоначальное значение =" + intVar);
        System.out.printf("%n значение после инкремента = " + intVar++);
        System.out.printf("%n значение после декремента =" + intVar-- + "%n");

        System.out.printf("%n Переменная типа Long: первоначальное значение =" + longVar);
        System.out.printf("%n значение после инкремента = " + longVar++);
        System.out.printf("%n значение после декремента =" + longVar-- + "%n");

        // -------------------------------------------------------------------------------------------
        System.out.printf("%n5. Перестановка значений переменных.%n%n");

        int num1 = 2;
        int num2 = 5;
        int num3 = 0;
        System.out.println("Исходные значения: X = " + num1 + " ; Y = " + num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Обмен значений с помощью третьей переменной:X = " + num1 + " ; Y = " + num2);
        num1 += num2; 
        num2 = num1 - num2; 
        num1 -= num2;
        System.out.println("Обмен значений с помощью арифметических операций:X = " + num1 + " ; Y = " + num2);
        num1 = num1 ^ num2; 
        num2 = num2 ^ num1; 
        num1 = num1 ^ num2;
        System.out.println("Обмен значений с помощью побитовой операции:X = " + num1 + " ; Y = " + num2);

        // -------------------------------------------------------------------------------------------
        System.out.printf("%n6. Вывод символов и их кодов.%n%n");

        char ch1 = '$';
        char ch2 = '*';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '~';
        System.out.println("Символ - " + ch1 + " ; Код символа -" + (int) ch1);
        System.out.println("Символ - " + ch2 + " ; Код символа -" + (int) ch2);
        System.out.println("Символ - " + ch3 + " ; Код символа -" + (int) ch3);
        System.out.println("Символ - " + ch4 + " ; Код символа -" + (int) ch4);
        System.out.println("Символ - " + ch5 + " ; Код символа -" + (int) ch5);

        // -------------------------------------------------------------------------------------------
        System.out.printf("%n7. Вывод в консоль ASCII-арт Дюка.%n%n");

        char duk1 = '/';
        char duk2 = '\\';
        char duk3 = '_';
        char duk4 = '(';
        char duk5 = ')';
        System.out.println("    " + duk1 + duk2);
        System.out.println("   " + duk1 + "  " + duk2);
        System.out.println("  " + duk1 + duk3 + duk4 + " " + duk5 + duk2);
        System.out.println(" " + duk1 + "      " + duk2);
        System.out.println(duk1 + "" + duk3 + duk3 + duk3 + duk3 + duk1 + duk2 + duk3 + duk3 + duk2);

        // -------------------------------------------------------------------------------------------
        System.out.printf("%n8. Манипуляции с сотнями, десятками и единицами числа.%n%n");

        int number = 123;
        int tensNumber = (number % 100) / 10;
        int hundredsNumber = number / 100;
        int unitsNumber = number % 10;
        int digitsSum = tensNumber + hundredsNumber + unitsNumber;
        int digitsProdukt = tensNumber * hundredsNumber * unitsNumber;
        System.out.println("Число " + number + " содержит:");
        System.out.println("сотен - " + hundredsNumber);
        System.out.println("десятков - " + tensNumber);
        System.out.println("единиц - " + unitsNumber);
        System.out.println("сумма разрядов = " + digitsSum);
        System.out.println("произведение разрядов = " + digitsProdukt);

        // -------------------------------------------------------------------------------------------
        System.out.printf("%n9. Перевод секунд в часы, минуты и секунды.%n%n");

        int allsec = 86399;
        int minutes = (allsec % 3600) / 60;
        int seconds = allsec % 60;
        int hours = allsec / 3600;
        System.out.println("оличество секунд = " + allsec);
        System.out.println(hours + ":" + minutes + ":" + seconds);
        
        // -------------------------------------------------------------------------------------------
        System.out.printf("%n10. Расчет стоимости товара со скидкой.%n%n");

        BigDecimal penPriceBd = new BigDecimal("105.5");
        BigDecimal bookPriceBd = new BigDecimal("235.83");
        BigDecimal discountBd = new BigDecimal("0.11");
        BigDecimal persentBd = new BigDecimal("100");

        BigDecimal sumOffDiscountBd = penPriceBd.add(bookPriceBd);
        
        BigDecimal sumDiscountBd = sumOffDiscountBd.multiply(discountBd).setScale(2, RoundingMode.HALF_UP);

        BigDecimal sumOnDiscountBd = sumOffDiscountBd.subtract(sumDiscountBd);

        System.out.println("Стоимость товара без скидки = " + sumOffDiscountBd);
        System.out.println("Сумма скидки = " + sumDiscountBd);
        System.out.println("Стоимость товара со скидкой = " + sumOnDiscountBd);
    }
}