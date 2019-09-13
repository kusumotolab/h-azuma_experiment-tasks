package conditional_branch;

// AtCoder Beginner Contest 039 - Bを改題
// https://atcoder.jp/contests/abc039/tasks/abc039_c

public class Task4_5 {
  public static void main(String[] args) {
    final String date = "0613";

    // get month and day from date
    final int month = Integer.parseInt(date.substring(0, 2));
    final int day = Integer.parseInt(date.substring(2, 4));

    int diff = 0;

    // regard the standard of the number of day in a month as 30
    for (int i = 1; i < month; i++) {
      switch (i) {
        case 2:
          diff -= 2;
          break;
        case 4:
          break;
        case 6:
          break;
        case 9:
          break;
        case 11:
          break;
        default:
          diff += 1;
      }
    }

    System.out.println((month - 1) * 30 + diff + day);
  }
}
