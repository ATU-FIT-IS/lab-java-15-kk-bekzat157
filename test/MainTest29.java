import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class MainTest29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        boolean dup = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!set.add(x)) dup = true;
        }

        System.out.println(dup ? "Duplicates found" : "No duplicates");
    }
}
