
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator newCalc = new Calculator();
        boolean goBack = true;
        while (goBack) {
            int number1 = newCalc.inputNumber1();
            char operation = newCalc.calculatorOperator();
            int number2 = newCalc.inputNumber2();
            int result = newCalc.calculation();
            System.out.println("Решение " + number1 + " " + operation + " " + number2 + " = " + result);
            goBack = newCalc.yesNo();
        }
    }
}