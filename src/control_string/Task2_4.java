package control_string;

// AtCoder Beginner Contest 044 - Bを改題
// https://atcoder.jp/contests/abc044/tasks/abc044_b

public class Task2_4 {
  public static void main(String[] args) {
    final String str = "ababbcca";
    final char[] characters = str.toCharArray();

    // "alphabet" stores the number of each alphabet in "str"
    int[] alphabet = new int[26];

    // count the number of each alphabet in "str"
    for (int i = 0; i < characters.length; i++) {
      alphabet[characters[i] - 'a'] += 1;
    }

    boolean answer = true;
    for (int i = 0; i < 26; i++) {
      if (alphabet[i] % 2 != 0) {
        answer = false;
        break;
      }
    }

    System.out.println(answer ? "Even" : "Odd");
  }
}
