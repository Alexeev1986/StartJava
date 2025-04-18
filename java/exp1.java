public class exp1 {
    public static void main (String[] args){
        int x = 0;              //Переменная хранит число
        if(x == 0){
            System.out.println("Выбранное вами число является нулем.");
        } else if(x > 0){
            boolean isEvenNumber = x % 2 == 0;
            if(isEvenNumber == true){
                System.out.println("Число " + x + " является положительным и четным");
            } else if(isEvenNumber == false){
                System.out.println("Число " + x + " является положительным и нечетным");
            }
        }else if(x < 0){
            boolean isEvenNumber = x % 2 == 0;
            if(isEvenNumber == true){
                System.out.println("Число " + x + " является отрицательным и четным");
            } else if(isEvenNumber == false){
                System.out.println("Число " + x + " является отрицательным и нечетным");
            }
        }
    }
}