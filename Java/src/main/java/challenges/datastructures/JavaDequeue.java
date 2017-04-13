package challenges.datastructures;

import java.util.*;

/**
 * Created by nino on 4/12/17.
 */
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> unique = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int num, max, removed;
        for (int i = 0; i < m; i++) {
            num = in.nextInt();
            deque.addLast(num);
            unique.add(num);
        }
        max = unique.size();
        for (int i = m; i < n; i++) {
            if(max == m)
                break;
            num = in.nextInt();
            removed = deque.removeFirst();
            if(!deque.contains(removed))
                unique.remove(removed);
            deque.addLast(num);
            unique.add(num);
            if (max < unique.size())
                max = unique.size();
        }
        System.out.println(max);
    }
}
