package mathmatical;

// AtCoder Beginner Contest 035 - Bを改題
// https://atcoder.jp/contests/abc035/tasks/abc035_b

public class Task3_5 {

  public static void main(String[] args) {
    // U:Upper, R:Right, D:Down, L:Left
    final String[] commandArray = {"U", "U", "R", "D", "U", "L"};

    // initial coordinate is (0, 0)
    int[] coordinate = {0, 0};

    for (String cmd : commandArray) {
      switch (cmd) {
        case "R":
          coordinate[0]++;
          break;
        case "L":
          coordinate[0]--;
          break;
        case "U":
          coordinate[1]++;
          break;
        case "D":
          coordinate[1]--;
          break;
      }
    }

    // output final coordinate
    System.out.println(coordinate[0] + " " + coordinate[1]);
  }
}
