package challenges.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by nino on 3/21/17.
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a, b;
        a = new BigInteger(sc.nextLine());
        b = new BigInteger(sc.nextLine());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
