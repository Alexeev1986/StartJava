package startjava.lesson2;

import lesson2.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean yesNo = true;
        while (yesNo) {
            System.out.print("\nВведите первое число: ");
            calc.setNumber1(console.nextInt());
            System.out.print("\nВведите знак операции (+, -, *, /, ^, %): ");
            char operation = console.next().charAt(0);
            if (operation == '+' ||
                    operation == '-' ||
                    operation == '*' ||
                    operation == '/' ||
                    operation == '^' ||
                    operation == '%') {
                calc.setOperator(operation);
            } else {
                System.out.println("Ошибка: операция " + operation + " не поддерживается");
                continue;
            }
            System.out.print("\nВведите второе число: ");
            calc.setNumber2(console.nextInt());
            calc.startCalculation();
            System.out.println("Закончить работу с программой? (y/n)");
            char answer = console.next().charAt(0);
            if (answer == 'y') yesNo = false;
        }
    }
}