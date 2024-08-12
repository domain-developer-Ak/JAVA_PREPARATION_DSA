import java.util.*;
import javax.crypto.spec.ChaCha20ParameterSpec;
public class Accenture_p1 {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch1 = sc.next().charAt(0);
    char ch2 = sc.next().charAt(0);
    char[] ch = str.toCharArray();
    for(int i = 0 ; i < ch.length ; i++){
        if(ch[i] == ch1) ch[i] = ch2;
        if(ch[i] == ch2) ch[i] = ch1;
    }
    for(int i = 0; i < ChaCha20ParameterSpec.length ; i++){
        System.out.print(ch[i]);
    }
}
