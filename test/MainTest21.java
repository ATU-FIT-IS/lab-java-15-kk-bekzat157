import java.util.Scanner;
public class MainTest21 {
    public static void main(String[] args) {
        int n = Math.abs(new Scanner(System.in).nextInt());
        int c = (n == 0) ? 1 : 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        System.out.println(c);
    }
}
