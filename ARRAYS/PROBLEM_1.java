package ARRAYS;
import java.util.*;
/*Find the Maximum and Minimum Elements: Write a function to find the largest and 
smallest elements in an unsorted array. (Solution: Iterate through the array, 
keeping track of the current maximum and minimum values. 
Time Complexity: O(n), Space Complexity: O(1)) */

public class PROBLEM_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value of n :");
        int n = scan.nextInt();
        if(n<=0){
            System.out.println("Error couldn't handle");
            return;
        }
        System.out.println("Enter Value 1 ");
        int firstvalue = scan.nextInt();
        int max = firstvalue;
        int min = firstvalue;
        for(int  i = 1 ; i < n ; i++){
            System.out.println("Enter Value " +(i+1) + " ");
            int nextvalue = scan.nextInt();
            if(nextvalue>=max){
                max = nextvalue;
            }
            else {
                min = nextvalue;
            }
        }
        System.out.println("Max value of Array is " + max);
        System.out.println("Min value of Array is " + min);        
    }
    }
/* 
    TIME COMPLEXITY : O(n)
    SPACE COMPLEXITY: O(1)
*/
