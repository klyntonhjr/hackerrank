package challenges.advanced;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Created by nino on 4/15/17.
 */
public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bytes = md.digest(sc.nextLine().getBytes());
        System.out.printf("%032x\n", new BigInteger(1,bytes));
    }
}
