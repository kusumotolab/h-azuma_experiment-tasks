package conditional_branch;

// AtCoder Beginner Contest 039 - Bを改題
// https://atcoder.jp/contests/abc039/tasks/abc039_c

import java.util.ArrayList;
import java.util.List;

public class Task4_3 {
  public static void main(String[] args) {
    final String targetDay = "sat";

    List<Integer> candidate = new ArrayList<>();
    // 1st is Wednesday
    int firstTargetDay = 1;

    switch (targetDay) {
      case "mon":
        firstTargetDay += 5;
        break;
      case "tue":
        firstTargetDay += 6;
        break;
      case "wed":
        // do nothing
        break;
      case "thu":
        firstTargetDay++;
        break;
      case "fri":
        firstTargetDay += 2;
        break;
      case "sat":
        firstTargetDay += 3;
        break;
      case "sun":
        firstTargetDay += 4;
        break;
    }

    for (int i = firstTargetDay; i <= 31; i += 7) {
      candidate.add(i);
    }
    System.out.println(candidate.get(candidate.size() - 2));
  }
}
