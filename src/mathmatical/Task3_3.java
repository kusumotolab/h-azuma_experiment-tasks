package mathmatical;

// AtCoder Beginner Contest 026 - Bを改題
// https://atcoder.jp/contests/abc026/tasks/abc026_b

import java.util.Arrays;
import java.util.List;

public class Task3_3 {

  public static void main(String[] args) {
    final List<Integer> radius = Arrays.asList(3, 4, 6);
    int redArea = 0;
    int whiteArea = 0;

    for (int i = 0; i < radius.size(); i++) {
      // pi has been removed for simplicity
      final int area = radius.get(i) * radius.get(i);

      // even is red, odd is white
      if (i % 2 == 0) {
        redArea += area;
      } else {
        whiteArea += area;
      }
    }

    System.out.println(redArea - whiteArea);
  }
}
