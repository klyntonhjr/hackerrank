package challenges.datastructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by nino on 3/26/17.
 */
public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack openBraces;
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            openBraces = new Stack();
            for(char c : input.toCharArray()){
                if(c=='(' || c=='{' || c=='[') {
                    openBraces.push(c);
                } else if (openBraces.isEmpty()) {
                    openBraces.push("not empty");
                    break;
                } else if( c==')' && (char) openBraces.peek() == '(' ||
                    c=='}' && (char) openBraces.peek() == '{' ||
                    c==']' && (char) openBraces.peek() == '[')
                    openBraces.pop();
                else
                    break;
            }

            if(openBraces.isEmpty())
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
