package challenges.strings;

import java.util.Scanner;

/**
 * Created by nino on 3/19/17.
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if(str.isEmpty()){
            System.out.println(str.length());
            return;
        }

        String[] strA = str.split("[ !,?._'@]+");
        System.out.println(strA.length);
        for(String s : strA){
            System.out.println(s);
        }
    }
}
