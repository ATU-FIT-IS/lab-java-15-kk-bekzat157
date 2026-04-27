import java.util.Scanner;
public class MainTest8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        String r = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(r) ? "Palindrome" : "Not Palindrome");
    }
}
