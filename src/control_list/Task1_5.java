package control_list;

// AtCoder Beginner Contest 043 - Bを改題
// https://atcoder.jp/contests/abc043/tasks/abc043_b

public class Task1_5 {

  public static void main(String[] args) {
    final String input = "012B81A";
    final String[] list = input.split("");
    String output = "";

    for (String c : list) {
      if (c.equals("B")) {
        // backspace to buffer
        output = output.substring(0, output.length() - 1);
      } else {
        // append to buffer
        output += c;
      }
    }

    System.out.println(output);
  }
}
