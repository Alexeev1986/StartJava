package lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        do {
            System.out.print("\nВведите первое число: ");
            calc.setNumber1(console.nextInt());
            System.out.print("\nВведите знак операции (+, -, *, /, ^, %): ");
            char operation = console.next().charAt(0);
            if (!calc.setOperator(operation)){
                System.out.println("Ошибка: операция " + operation + " не поддерживается");
                continue;
            }
            System.out.print("\nВведите второе число: ");
            calc.setNumber2(console.nextInt());
            if ((calc.getNumber2() == 0 && operation == '/')) {
                System.out.println("Ошибка делить на 0 нельзя");
                continue;
            }
            calc.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = console.next().trim();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}