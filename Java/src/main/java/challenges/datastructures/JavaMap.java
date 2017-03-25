package challenges.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nino on 3/25/17.
 */
public class JavaMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        Map<String, Integer> phonebook = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();

            phonebook.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phonebook.get(s) != null){
                System.out.println(s + "=" + phonebook.get(s));
            } else
                System.out.println("Not found");
        }
        in.close();
    }
}
