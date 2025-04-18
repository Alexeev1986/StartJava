public class MyApp {
    public static void main (String[] args){
        //TODO: проссумировать числа от 1 -5

        int sum = 1 + 2;
        boolean isEvenNumber = sum % 2 == 0;
        if(isEvenNumber == true){
            System.out.println("Число " + sum + " является четным");
        } else if(isEvenNumber == false){
            System.out.println("Число " + sum + " является нечетным");
        }
        System.out.println((sum % 2) + " остаток от делания" );

        int sum1 = sum + 3;
        isEvenNumber = sum1 % 2 == 0;
        if(isEvenNumber == true){
            System.out.println("Число " + sum1 + " является четным");
        } else if(isEvenNumber == false){
            System.out.println("Число " + sum1 + " является нечетным");
        }
        System.out.println((sum1 % 2) + " остаток от делания" );

        int sum2 = sum1 + 4;
        isEvenNumber = sum2 % 2 == 0;
        if(isEvenNumber == true){
            System.out.println("Число " + sum2 + " является четным");
        } else if(isEvenNumber == false){
            System.out.println("Число " + sum2 + " является нечетным");
        }
        System.out.println((sum2 % 2) + " остаток от делания" );

        int result = sum2 + 5;
        isEvenNumber = result % 2 == 0;
        if(isEvenNumber == true){
            System.out.println("Число " + result + " является четным");
        } else if(isEvenNumber == false){
            System.out.println("Число " + result + " является нечетным");
        }
        System.out.println((result % 2) + " остаток от делания" );

        System.out.println(result);
    }
}