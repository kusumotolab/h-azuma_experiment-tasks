package control_list;

// AtCoder Beginner Contest 014 - Bを改題
// https://atcoder.jp/contests/abc014/tasks/abc014_2

import java.util.Arrays;
import java.util.List;

public class Task1_2 {

  public static void main(String[] args) {
    final List<Integer> list = Arrays.asList(3, 5, 2, 7, 4);
    final int filter = 18;

    // convert integer to binary
    final String binary = Integer.toBinaryString(filter);

    int sum = 0;

    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '1') {
        // add list(i) to sum
        sum += list.get(i);
      }
    }

    System.out.println(sum);
  }
}
