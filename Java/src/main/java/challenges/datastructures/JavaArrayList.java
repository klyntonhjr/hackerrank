package challenges.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nino on 3/25/17.
 */
public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Number of lines
        int n = sc.nextInt();
        int arrSize;
        List<List<Integer>> arrList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arrSize = sc.nextInt();
            arrList.add(new ArrayList<>(arrSize));
            for (int j = 0; j < arrSize; j++) {
                arrList.get(i).add(j, sc.nextInt());
            }
        }

        //Number of queries
        int queries = sc.nextInt();
        int x, y;
        for (int i = 0; i < queries; i++) {
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;

            try{
                System.out.println(arrList.get(x).get(y));
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
