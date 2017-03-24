package challenges.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by nino on 3/21/17.
 */
public class JavaPrimality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigI= sc.nextBigInteger();
        sc.close();

        if(bigI.isProbablePrime(10)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
