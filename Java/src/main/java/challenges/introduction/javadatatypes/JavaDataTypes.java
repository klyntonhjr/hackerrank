package challenges.introduction.javadatatypes;

import java.util.Scanner;

/**
 * Created by nino on 3/18/17.
 */
public class JavaDataTypes {
    private static String fitsIn = " can be fitted in:";
    private static String fitsInByte = "* byte\n";
    private static String fitsInShort = "* short\n";
    private static String fitsInInt = "* int\n";
    private static String fitsInLong = "* long";
    private static String cantFit = " can't be fitted anywhere.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+fitsIn);
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                    System.out.println(fitsInByte + fitsInShort + fitsInInt + fitsInLong);
                else if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                    System.out.println(fitsInShort + fitsInInt + fitsInLong);
                else if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                    System.out.println(fitsInInt + fitsInLong);
                else
                    System.out.println(fitsInLong);
            }
            catch(Exception e)
            {
                System.out.println(sc.next() + cantFit);
            }
        }
    }
}
