import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class rough1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[];
        arr[0] = scan.nextLine[];
        for(int i = 1 ; i < n ; i++){
            int a = scan.nextInt();
            int flag = 0;
            for(int j = 0 ; j < i ; j++){
                if(a == arr[j]){
                    flag++;
                }
            }
            if(flag==0){
                arr[i] = a;
            }
        }
    }
}