import java.nio.charset.Charset;

public class expDoWhile {
    public static void main(String[] args) {
        // пример do-while
        int count1 = 0;
        do {
            System.out.println(count1);
            count1++;
        } while (count1 < 5);

        // пример while
        int count2 = 0;
        while (count2 < 5) {
            System.out.println(count2);
            count2++;
        }
        System.out.println(Charset.defaultCharset().displayName());
    }
}