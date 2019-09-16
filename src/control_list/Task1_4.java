package control_list;

// AtCoder Beginner Contest 029 - Bを改題
// https://atcoder.jp/contests/abc029/tasks/abc029_b

import java.util.Arrays;
import java.util.List;

public class Task1_4 {

  public static void main(String[] args) {
    final List<String> list = Arrays.asList("january", "february", "march", "april", "may", "june");

    int n = 0;

    for (int i = 0; i < list.size(); i++) {
      // split a string into single characters array
      final String[] strArray = list.get(i).split("");

      for (String character : strArray) {
        if (character.equals("r")) {
          // count the number of strings containing "r"
          n++;
          break;
        }
      }
    }

    System.out.println(n);
  }
}
