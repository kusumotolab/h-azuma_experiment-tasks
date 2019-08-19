package control_string;

// AtCoder Beginner Contest 052 - Bを改題
// https://atcoder.jp/contests/abc052/tasks/abc052_b

public class Task2_6 {

  public static void main(String[] args) {
    final String str = "DIDIRIIID";

    String tmp = str;
    int n = 0;

    // length of "str" is 10
    for (int i = 0; i < str.length(); i++) {
      if (tmp.charAt(i) == 'D') {
        n--;
      } else if (tmp.charAt(i) == 'I') {
        n++;
      } else if (tmp.charAt(i) == 'R') {
        // reverse "tmp" string
        StringBuffer sb = new StringBuffer(str);
        tmp = sb.reverse().toString(); // reversed "str" is "DIIIRIDID"
      }
    }

    System.out.println(n);
  }
}
