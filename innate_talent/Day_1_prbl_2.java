package innate_talent;
import java.util.*;

public class Day_1_prbl_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = 0;
        int t = 0;

        while (n != 0) {
            int rem = n % 10;
            if (rem > u) {
                u = rem;
            }
            if (rem % 2 != 0 && rem > t&& rem!=u) {
                t = rem;
            }
            n /= 10;
        }

        int result = u * 10 + t;
        System.out.println(result);
        sc.close();
    }
}
