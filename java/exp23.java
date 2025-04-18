public class exp23 {
    public static void main(String[] args) {
        int x = 1234;
        int a = 0;
        int sum = 0;
        while(x > 0){
            a = x % 10;
            sum = sum +a;
            System.out.println(a);
            x = x / 10;
        }
        System.out.println("Сумма чисел = " + sum);
    }
}
