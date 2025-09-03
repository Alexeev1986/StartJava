package lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        char answer;
        do {
            System.out.print("\nВведите первое число: ");
            calc.setNumber1(console.nextInt());
            System.out.print("\nВведите знак операции (+, -, *, /, ^, %): ");
            char operation = console.next().charAt(0);
            if (!calc.setOperator(operation)){
                System.out.println("Ошибка: операция " + operation + " не поддерживается");
                answer = 'n';
                continue;
            }
            System.out.print("\nВведите второе число: ");
            calc.setNumber2(console.nextInt());
            if ((calc.getNumber2() == 0 && operation == '/') || (calc.getNumber2() == 0 && operation == '%')) {
                System.out.println("Ошибка делить на 0 нельзя");
                answer = 'n';
                continue;
            }
            calc.calc();
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = console.next().charAt(0);
        } while (answer == 'y');
    }
}