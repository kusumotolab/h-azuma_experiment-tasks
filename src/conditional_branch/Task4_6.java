package conditional_branch;

// AtCoder Beginner Contest 014 - Bを改題
// https://atcoder.jp/contests/abc014/tasks/abc014_2

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4_6 {
  public static void main(String[] args) {
    final List<Integer> numbers = Arrays.asList(1, 3, 0, 2, 1, 1);

    List<String> bin = new ArrayList<>();
    for (int num : numbers) {
      // convert each numbers into binary
      switch (num) {
        case 0:
          bin.add("00");
          break;
        case 1:
          bin.add("01");
          break;
        case 2:
          bin.add("10");
          break;
        case 3:
          bin.add("11");
          break;
      }
    }

    int output = 0;
    for (int i = 0; i < bin.size(); i += 2) {
      // attention: "bin" is String list
      output += Integer.parseInt(bin.get(i) + bin.get(i + 1), 2);
    }

    System.out.println(output);
  }
}
