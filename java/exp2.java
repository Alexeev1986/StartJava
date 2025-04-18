public class exp2 {
    public static void main (String[] args){
        int x1 = 523;                   //присваиваем значение 2м переменным
        int x2 = 223;
        int ones1, tens1, hundreds1;    //переменные которые хранят: еденицы, десятки, сотни.
        int ones2, tens2, hundreds2;
        ones1 = x1 % 10;                
        tens1 = (x1 / 10) % 10;
        hundreds1 = (x1 / 100) % 10;
        ones2 = x2 % 10;
        tens2 = (x2 / 10) % 10;
        hundreds2 = (x2 / 100) % 10;
        if(hundreds1 == hundreds2 & tens1 == tens2 & ones1 == ones2){
            System.out.println("Выбранные вами числа равны");
        }else if(hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2){
                System.out.println("Выбранные числа : " + x1 + " и " + x2);
                if(hundreds1 == hundreds2){
                    System.out.println("Одинаковый сотни: " + hundreds1 + " и " + hundreds2);
                }
                if(tens1 == tens2){
                    System.out.println("Одинаковый десятки: " + tens1 + " и " + tens2);
                }
                if(ones1 == ones2){
                    System.out.println("Одинаковый единицы: " + ones1 + " и " + ones2);
                }
                
        }else{
            System.out.println("В выбранных вами числах нет одинаковых цифр");
            }
    }
}