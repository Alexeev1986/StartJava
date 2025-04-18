public class exp26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%n");
            for (int j = 1; j <= 10; j++) {
               System.out.printf(" * ");
            }
        }
        System.out.printf("%n");
        int count1 = 0;
        int count2 = 0;
        while (count1 <= 5) {
            while (count2 < (5 - count1)){
                System.out.printf(" # ");
                count2++;
            }
        count2 = 0;
        System.out.printf(" # %n");
        count1++;
        }
        System.out.printf("%n");
        count1 = 0;
        count2 = 0;
        int n = 0;
        int tr = 1;
        do {
            do{
                System.out.printf(" $ ");
                count2++;
            } while ((count2 - 1) < n);
            if(count1 < 2 ){
                n = n + 1;
            }else if(count1 >= 2){
                n = n - 1;
            }
            System.out.printf("%n");
            count1++;
            count2 = 0;
        } while (count1 < 5);

    }
}
