package conditional_branch;

// AtCoder Beginner Contest 039 - Bを改題
// https://atcoder.jp/contests/abc039/tasks/abc039_c

import java.util.ArrayList;
import java.util.List;

public class Task4_3 {
  public static void main(String[] args) {
    final String week = "Sat";
    int firstDay = 1;

    switch (week) {
      case "Mon":
        firstDay += 5;
        break;
      case "tue":
        firstDay += 6;
        break;
      case "wed":
        // 1st is Wednesday
        break;
      case "thu":
        firstDay++;
        break;
      case "fri":
        firstDay += 2;
        break;
      case "sat":
        firstDay += 3;
        break;
      case "sun":
        firstDay += 4;
        break;
    }

    List<Integer> candidate = new ArrayList<>();
    for (int i = firstDay; i <= 31; i += 7) {
      candidate.add(i);
    }
    
    System.out.println(candidate.get(candidate.size() - 1));
  }
}
