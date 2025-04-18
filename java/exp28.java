public class exp28 {
    public static void main (String[] args){
        int number= 1234321;
        int sizeNumber = String.valueOf(number).length();
        String strNumber = String.valueOf(number);
        boolean isPolindrom = true;
        for (int i = 0; i < sizeNumber / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(sizeNumber - i -1)){
                isPolindrom = false;
            }
        }
        if (isPolindrom){
            System.out.println("Это число " + number + "является палиндромом");
        } else {
            System.out.println("Это число " + number + " не является палиндромом");
        }
    }
}

