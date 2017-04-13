package challenges.datastructures;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by nino on 4/12/17.
 */
public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, sizeB1, sizeB2;
        n = sc.nextInt();
        m = sc.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        String cmd;
        int arg0, arg1;
        for (int i = 0; i < m; i++) {
            cmd = sc.next();
            arg0 = sc.nextInt();
            arg1 = sc.nextInt();
            switch (cmd){
                case "AND":
                    if (arg0 == 1) b1.and(b2);
                    else b2.and(b1);
                    break;
                case "OR":
                    if (arg0 == 1) b1.or(b2);
                    else b2.or(b1);
                    break;
                case "XOR":
                    if (arg0 == 1) b1.xor(b2);
                    else b2.xor(b1);
                    break;
                case "FLIP":
                    if (arg0 == 1) b1.flip(arg1);
                    else b2.flip(arg1);
                    break;
                case "SET":
                    if (arg0 == 1) b1.set(arg1);
                    else b2.set(arg1);
                    break;
                default:
                    System.out.println("Unexpected command:" + cmd);
            }

            sizeB1 = b1.cardinality();
            sizeB2 = b2.cardinality();
            System.out.println(sizeB1 + " " + sizeB2);
        }
    }
}
