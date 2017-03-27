package challenges.datastructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by nino on 3/26/17.
 */
public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack openBraces = new Stack();
        while (sc.hasNext()) {
            String input=sc.next().trim();
            boolean stackIsBalanced = true;
            //Complete the code
            char c;
            for (int i = 0; i < input.length(); i++) {
                c = input.charAt(i);
                if(c == '(' || c == '{' || c == '['){
                    openBraces.push(c);
                    continue;
                }

                switch (c){
                    case ')':
                        if((char) openBraces.pop() == '(')
                            continue;
                        stackIsBalanced = false;
                        break;
                    case '}':
                        if((char) openBraces.pop() == '{')
                            continue;
                        stackIsBalanced = false;
                        break;
                    case ']':
                        if((char) openBraces.pop() == '[')
                            continue;
                        stackIsBalanced = false;
                        break;
                }
            }

            if(stackIsBalanced && openBraces.isEmpty())
                System.out.println("true");
            else
                System.out.println("false");

            openBraces = new Stack();
        }
    }
}
