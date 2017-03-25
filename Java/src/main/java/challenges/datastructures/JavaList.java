package challenges.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nino on 3/25/17.
 */
public class JavaList {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int initNumOfElements = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < initNumOfElements; i++) {
            list.add(sc.nextInt());
        }

        int index, num;
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            String cmd = sc.next().trim();
            switch (cmd){
                case "Insert":
                    index = sc.nextInt();
                    num = sc.nextInt();
                    list.add(index, num);
                    break;
                case "Delete":
                    index = sc.nextInt();
                    list.remove(index);
                    break;
                default:
                   throw new Exception("Expected 'Insert' or 'Delete' command. Command received = '" + cmd + "'");
            }
        }

        String output = list.toString();
        System.out.print(output.replaceAll("\\[|\\]|,", ""));
    }
}
