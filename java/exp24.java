

public class exp24 {
    public static void main(String[] args) {
        int num = 24;                       //Переменная отвечающая за конец интервала
        int NColum = 0;                     //Переменная отвечающая за количество символов
        boolean isEvenNumber;               //Переменная индикатор(четное число или не четное)
        for (int i = 1; i <= num; i++) {    
            isEvenNumber = i % 2 == 0;
            if(isEvenNumber == false){
                NColum = NColum + 1;       //накапливаем счетчик количества символов в строке
                System.out.printf("%4d", i);    //%4d"-правило для выравнивания чисел при выводе
                if(NColum > 4){
                    System.out.printf("%n");
                    NColum = 0;
                }
            }
        }
        if(NColum != 0){                //если счетчик чисел в строке не равен 0 до довыводим в строку нужное количество 0.
            for (int j = NColum; j < 5; j++)System.out.printf("%4d",0);
        }
    } 
}

