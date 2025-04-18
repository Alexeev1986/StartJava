public class exp27 {
    public static void main (String[] args){
        System.out.printf("%10s%20s%20s%n","DECIMAL","CHARACTER","DESCRIPTION"); // выводим заголовок таблицы зарание 
        System.out.println("-----------------------------------------------------");
        for (int i = 33; i <= 47; i++) {                                    //указываем диапазон символов с 33 до 47
            if(i % 2 != 0){                                                 //проверка условий: четный ли код символа
                System.out.printf("%7d",i);
                System.out.printf("%19s",(char) i);
                System.out.printf("%-20s%n","\t" + "\t" + Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {                                   //указываем диапазон букв с 97 до 122
            if(i % 2 == 0 & Character.isLetter((char) i) == true){        //проверка условий: четный ли код символа, является буквой, 
                System.out.printf("%7d",i);                                 //является большой или маленькой.
                System.out.printf("%19s",(char) i);
                System.out.printf("%-20s%n","\t" + "\t" + Character.getName(i));
            }
         }
    }
}
