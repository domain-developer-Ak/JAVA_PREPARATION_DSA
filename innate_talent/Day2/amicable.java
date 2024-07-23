package innate_talent.Day2;
import java.util.*;
public class amicable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        for(int i = 1 ; i< n ; i++){
            if(n%i == 0){
                sum1+=i;
            }
        }
        int sum2 = 0;
        for(int i = 1 ; i<sum1 ; i++){
            if(sum1%i == 0){
                
                sum2 += i;
            }
        }
        if(n == sum2){
            System.out.println("Amicable Number");
        }
        else {
            System.out.println("Not a amicable number");
        }
    }
}
