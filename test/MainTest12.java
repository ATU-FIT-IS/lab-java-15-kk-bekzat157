import java.util.Scanner;
public class MainTest12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine().toLowerCase();
        int c = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) c++;
        }
        System.out.println(c);
    }
}
