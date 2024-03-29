package mathmatical;

// AtCoder Beginner Contest 006 - Bを改題
// https://atcoder.jp/contests/abc006/tasks/abc006_2

public class Task3_9 {
  public static void main(String[] args) {
    // initial numbers
    int a1 = 0;
    int a2 = 0;
    int a3 = 1;

    int sum = 0;

    for (int i = 0; sum < 10; i++) {
      sum = a1 + a2 + a3;

      // swap variables
      a1 = a2;
      a2 = a3;
      a3 = sum;
    }

    System.out.println(sum);
  }
}
