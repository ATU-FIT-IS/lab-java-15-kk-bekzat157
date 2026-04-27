import java.util.Scanner;
public class MainTest28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        System.out.println(s.indexOf(c) != -1 ? "Found" : "Not Found");
    }
}
