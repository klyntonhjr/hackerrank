package challenges.advanced;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Created by nino on 4/15/17.
 */
public class JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        sc.close();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(in.getBytes(StandardCharsets.UTF_8));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb);
    }
}
