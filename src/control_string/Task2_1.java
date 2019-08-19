package control_string;

// AtCoder Beginner Contest 002 - Bを改題
// https://atcoder.jp/contests/abc002/tasks/abc002_2

public class Task2_1 {
  public static void main(String[] args) {
    final String str = "amklammslo";
    
    String buffer = "";
    
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) != 'm' && str.charAt(i) != 'l') {
        buffer += str.charAt(i);
      }
    }
    
    System.out.println(buffer);
  }
}
