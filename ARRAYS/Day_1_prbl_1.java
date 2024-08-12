 package innate_talent;
import java.util.Scanner;
public class Day_1_prbl_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[5];
        int j = 0;
        while(a!=0){
            int n = a%10;
            int flag = 0;
            for(int i = 2; i<n ; i++){
                if(n%i == 0){
                    flag++;
                }
            }
            if(flag==0){
                arr[j++] = n;
            }
            a /= 10;
        }
        for(int i = j-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}


