package mathmatical;

// AtCoder Beginner Contest 006 - Bを改題
// https://atcoder.jp/contests/abc006/tasks/abc006_2

public class Task3_1 {
  public static void main(String[] args) {
    // followings are initial numbers
    final int a1 = 0;
    final int a2 = 0;
    final int a3 = 1;

    // an is n-th number in this sequence
    int an = 0;
    int an_3 = a1;
    int an_2 = a2;
    int an_1 = a3;

    for (int i = 0; i < 4; i++) {
      an = an_3 + an_2 + an_1;

      an_3 = an_2;
      an_2 = an_1;
      an_1 = an;
    }

    System.out.println(an);
  }
}
