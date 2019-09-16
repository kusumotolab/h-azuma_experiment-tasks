package conditional_branch;

// AtCoder Beginner Contest 014 - Bを改題
// https://atcoder.jp/contests/abc014/tasks/abc014_2

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4_6 {
  public static void main(String[] args) {
    final List<Integer> numbers = Arrays.asList(1, 3, 0, 1, 1);

    List<String> binaries = new ArrayList<>();
    for (int number : numbers) {
      // convert each numbers into binary
      switch (number) {
        case 0:
          binaries.add("00");
          break;
        case 1:
          binaries.add("01");
          break;
        case 2:
          binaries.add("10");
          break;
        case 3:
          binaries.add("11");
          break;
      }
    }

    int output = 0;
    for (String binary : binaries) {
      // summing up bins as decimal
      output += Integer.parseInt(binary);
    }

    System.out.println(output);
  }
}
