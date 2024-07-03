import java.util.*;
public class Array {
    public static void main(String[] args) {
        int n;
        int[] arr;
        try (Scanner scan = new Scanner(System.in)) {
            n = scan.nextInt();
            arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = scan.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("Array List");
        for (int i = 0; i < n; i++) {
            System.out.print((arr[i] * 5) + " ");
        }
    }
}
