public class exp3 {
    public static void main (String[] args){
        char strX = '$';
        boolean isLetter = Character.isLetter(strX);            //Переменная для распознания Букв
        boolean isLetterUp = Character.isUpperCase(strX);       //Переменная для распознания Регистра Букв
        boolean isNumber = Character.isDigit(strX);             //Переменная для распознания Чисел

        if(isLetter == true){
            if(isLetterUp == true){
                System.out.println(strX + " - большая буква");
            }else{
                System.out.println(strX + " - маленькая буква");
            }
        }else if(isNumber == true){
            System.out.println(strX + " - это число");
        }else{
            System.out.println(strX + " - это иной символ");
        }
    }

}

