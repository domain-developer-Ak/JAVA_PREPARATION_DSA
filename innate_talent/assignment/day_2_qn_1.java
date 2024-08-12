package innate_talent.assignment;
import java.util.*;
public class day_2_qn_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s", "");
        char[] ch = s.toCharArray();
        int[] dp = new int[26];
        for (int i = 0; i < s.length(); i++) {
           dp[ch[i]-97]++;
            }
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            System.out.print(dp[i]+" ");
            if(dp[1]!=1){
                flag++;
            }
        }
        if(flag==0) System.out.println("Pangrams");
        else System.out.println("Not Pangrams");
    }
}
