import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 1 число ");
        int variable1 = console.nextInt();
        System.out.println("Введите мат действие (+, -, *, /, %, ^) ");
        char matAction = console.next().charAt(0);
        System.out.println("Введите 2 число ");
        int variable2 = console.nextInt();
        
        int answer = 0;

        if (matAction == '+') {
            answer = variable1 + variable2;
        } else if (matAction == '-') {
            answer = variable1 - variable2;
        } else if (matAction == '/') {
            answer = variable1 / variable2;
        } else if (matAction == '%') {
            answer = variable1 % variable2;
        } else if (matAction == '*') {
            answer = variable1 * variable2;
        } else if (matAction == '^') {
            int counter = variable2;
            answer = variable1;
            while (counter > 1) {
                answer *= variable1;
                counter--;
            }
        }
        System.out.println(variable1 + " " + matAction + " " + variable2 + " = " + answer);
    }
}