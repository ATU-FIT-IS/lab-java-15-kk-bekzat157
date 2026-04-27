import java.util.Scanner;
public class MainTest1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinshi sandy engiziniz: ");
        int a = sc.nextInt();
        System.out.print("Birinshi sandy engiziniz: ");
        int b = sc.nextInt();
        int min = 0, max =0;
        if(a > b) {
            System.out.println(a);

        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("Ekeui ten");
        }
    }

}
