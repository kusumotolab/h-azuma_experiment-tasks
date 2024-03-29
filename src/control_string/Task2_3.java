package control_string;

// AtCoder Beginner Contest 032 - Bを改題
// https://atcoder.jp/contests/abc032/tasks/abc032_b

import java.util.HashSet;
import java.util.Set;

public class Task2_3 {

  public static void main(String[] args) {
    final String str = "abcaabc";
    final int windowSize = 2;

    // "set" stores substring of "str"
    Set<String> set = new HashSet<>();

    for (int i = 0; i < str.length() - windowSize + 1; i++) {
      set.add(str.substring(i, i + windowSize));
    }

    // output the number of substrings
    System.out.println(set.size());
  }
}
