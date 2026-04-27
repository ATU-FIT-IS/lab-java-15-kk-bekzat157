import java.util.Scanner;
public class MainTest16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        int c = 0;
        for (char ch : s.toCharArray()) if (ch == ' ') c++;
        System.out.println(c);
    }
}
