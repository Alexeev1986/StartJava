import java.util.Scanner;

public class Calculator {
    int number1;
    int number2;
    char operation;

    public Calculator() {
        this.number1 = 0;
        this.number2 = 0;
        this.operation = 'f';
    }

    public Calculator(int number1, int number2, char operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    int inputNumber1() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое число  ");
        int number1 = console.nextInt();
        this.number1 = number1;
        return number1;
    }

    int inputNumber2() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите второе число  ");
        int number2 = console.nextInt();
        this.number2 = number2;
        return number2;
    }

    char calculatorOperator() {
        Scanner console = new Scanner(System.in);
        boolean goBack = true;
        while (goBack) {
            System.out.print("Введите знак операции(+, -, *, /, ^,%)  ");
            char inputOperation = console.next().charAt(0);
            switch (inputOperation) {
                case '+':
                    this.operation = inputOperation;
                    goBack = false;
                    break;
                case '-':
                    this.operation = inputOperation;
                    goBack = false;
                    break;
                case '/':
                    this.operation = inputOperation;
                    goBack = false;
                    break;
                case '%':
                    this.operation = inputOperation;
                    goBack = false;
                    break;
                case '*':
                    this.operation = inputOperation;
                    goBack = false;
                    break;
                case '^':
                    this.operation = inputOperation;
                    goBack = false;
                    break;
                default:
                    System.out.println("Операция " + operation + " не поддерживается");
            }
        }
        return operation;
    }

    int calculation() {
        int result = 0;
        if (this.operation == '+') {
            result = this.number1 + this.number2;
        } else if (this.operation == '-') {
            result = this.number1 - this.number2;
        } else if (this.operation == '/') {
            if (this.number2 == 0) {
                System.out.println("Ошибка: деление на ноль запрещено");
            } else {
                result = this.number1 / this.number2;
            }
        } else if (this.operation == '%') {
            if (this.number2 == 0) {
                System.out.println("Ошибка: деление на ноль запрещено");
            } else {
                result = this.number1 % this.number2;
            }
        } else if (this.operation == '*') {
            result = this.number1 * this.number2;
        } else if (this.operation == '^') {
            result = this.number1;
            for (int i = 1; i < this.number2; i++) {
                result *= this.number1;
            }
        }
        return result;
    }

    boolean yesNo() {
        Scanner console = new Scanner(System.in);
        System.out.print("Хотите продолжить вычисления? [yes/no]  ");
        String answer = console.next();
        boolean report = true;
        while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Некорректный ввод. Пожалуйста, введите 'yes' или 'no'.");
                System.out.print("Хотите продолжить вычисления? [yes/no]:  ");
                answer = console.next();
            }
        if (answer.equals("no")) {
            report = false;
        }
        return report;
    }
}