package challenges.bignumber.javabigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by nino on 3/21/17.
 */
public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        String temp;
        BigDecimal a, b;
        int k;
        for (int i = n-2; i >= 0; i--) {
            a = new BigDecimal(s[i]);
            temp = s[i];
            k = i;
            for (int j = i+1; j < n; j++) {
                b = new BigDecimal(s[j]);
                if(a.compareTo(b) < 0){
                    s[k++] = s[j];
                }
            }
            s[k] = temp;
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
