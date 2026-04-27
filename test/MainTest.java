import java.util.Scanner;
public class MainTest {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Sandy engiziniz: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");
        }
    }
}