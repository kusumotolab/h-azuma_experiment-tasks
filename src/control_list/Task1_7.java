package control_list;

// AtCoder Beginner Contest 064 - Bを改題
// https://atcoder.jp/contests/abc064/tasks/abc064_b

public class Task1_7 {

  public static void main(String[] args) {
    final String str1 = "summer";
    final String str2 = "winter";

    String buffer1 = "";
    String buffer2 = "";

    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        buffer1 += str1.charAt(i);
        buffer2 += str2.charAt(i);
      }
    }

    System.out.println(buffer1 + buffer2);
  }
}
