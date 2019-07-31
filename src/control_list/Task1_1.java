package control_list;

// AtCoder Beginner Contest 009 - Bを改題
// https://atcoder.jp/contests/abc009/tasks/abc009_2

import java.util.Arrays;
import java.util.List;

public class Task1_1 {
    public static void main(String[] args) {
        // prepare an integer list
        final List<Integer> list = Arrays.asList(1200, 300, 1200, 500, 800);

        int second = 0;
        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                // update max and second
                second = max;
                max = list.get(i);
            } else if (list.get(i) > second && list.get(i) < max) {
                second = list.get(i);
            }
        }

        System.out.println(second);
    }
}
