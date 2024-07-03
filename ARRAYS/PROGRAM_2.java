package ARRAYS;

import java.util.*;

/*Linear Search: Implement a linear search algorithm to find a specific element within an array. (Solution: 
Iterate through the array, returning the index if the element is found. Time Complexity: O(n) in the worst case, Space Complexity: O(1)) */
public class PROGRAM_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Values must present ?");
        int n = scan.nextInt();
        System.out.print("Enter Value to be searched?");
        int search = scan.nextInt();
        System.out.println("\n");
        for(int i = 0 ; i < n ; i++){
            int value = scan.nextInt();
            if(value == search){
                System.out.println(search + " found at position " + (i+1));
            }
        }
    }
}
