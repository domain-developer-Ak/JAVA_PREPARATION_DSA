package innate_talent.Day3;
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int size = 2 * n - 1;
        
        System.out.println("\nPattern:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = n;
                if (i < n) {
                    value = (i < value) ? i + 1 : value;
                } else {
                    value = ((size - 1 - i) < value) ? (size - i) : value;
                }
                
                if (j < n) {
                    value = (j < value) ? j + 1 : value;
                } else {
                    value = ((size - 1 - j) < value) ? (size - j) : value;
                }
                
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
