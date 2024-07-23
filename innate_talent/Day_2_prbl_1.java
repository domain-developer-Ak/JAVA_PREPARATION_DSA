package innate_talent;
import java.util.Scanner;

public class Day_2_prbl_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        char m = sc.next().charAt(0);
        int range = sc.nextInt();
        for (int i = 1; i <= range; i++) {
            String numStr = String.valueOf(i);
            int valid = 1;

            for (char c : numStr.toCharArray()) {
                if (c != n && c != m) {
                    valid = 0;
                    break;
                }
            }

            if (valid==1) {
                System.out.print(i+ " ");
            }
        }
    }
}
