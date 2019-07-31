package control_list;

// AtCoder Beginner Contest 061 - Bを改題
// https://atcoder.jp/contests/abc061/tasks/abc061_b

import java.util.Arrays;
import java.util.List;

public class Task1_6 {
    public static void main(String[] args) {
        final List<Integer> list1 = Arrays.asList(1, 3, 2, 3, 3);
        final List<Integer> list2 = Arrays.asList(2, 1, 1, 2, 1);
        int pairs = 0;

        // count pairs of number
        outside : for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < i; j++) {
                if ((list1.get(i) == list2.get(j) && list2.get(i) == list1.get(j))
                 || (list1.get(i) == list1.get(j) && list2.get(i) == list2.get(j))) {
                    continue outside;
                }
            }
            pairs++;
        }

        // output number of pairs
        System.out.println(pairs);
    }
}
