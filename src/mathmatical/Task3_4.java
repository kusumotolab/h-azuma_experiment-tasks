package mathmatical;

// AtCoder Beginner Contest 030 - Bを改題
// https://atcoder.jp/contests/abc030/tasks/abc030_b

public class Task3_4 {

  public static void main(String[] args) {
    final int shortHand = 11;
    final int longHand = 40;

    // 0.5 is the angle short hand exceed per 1min.
    double shortHandAngle = (double) (shortHand % 12) * 30.0 + (double) longHand * 0.5;

    // 6.0 is the angle long hand exceed per 1min.
    double longHandAngle = (double) longHand * 6.0;

    if (shortHandAngle >= longHandAngle) {
      System.out.println(shortHandAngle - longHandAngle);
    } else {
      System.out.println(longHandAngle - shortHandAngle);
    }
  }
}
