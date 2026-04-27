import java.util.Scanner;
public class MainTest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println(a);
    }
}
