package challenges.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by nino on 4/16/17.
 */
public class JavaLambdaExpressions {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.is_odd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.is_prime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.is_palindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public PerformOperation is_odd = (int a) -> a%2 == 1;
    public PerformOperation is_prime = (int a) -> {
        for(int i=2;2*i<a;i++) {
            if(a%i==0)
                return false;
        }
        return true;
    };
    public PerformOperation is_palindrome = (int a) ->
        a == Integer.parseInt(new StringBuffer().append(a).reverse().toString());

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation is_odd() {
        return is_odd;
    }

    public PerformOperation is_prime() {
        return is_prime;
    }

    public PerformOperation is_palindrome() {
        return is_palindrome;
    }
}
