public class exp25 {
    public static void main(String[] args) {
        int Digit = 32425922;
        int x = Digit;
        int SumTwo = 0;
        int a = 0;
        while(x > 0){
            a = x % 10;
            if(a == 2){
                SumTwo = SumTwo + 1;
            }
            x = x / 10;
        }
        boolean isEvenNumber = SumTwo % 2 == 0;
        if(isEvenNumber == true){
            System.out.println("В " + Digit + " Четное, Количество двоек " + SumTwo);
        }
        else {
            System.out.println("В " + Digit + " Не четное, Количество двоек " + SumTwo);
        }
    }
}