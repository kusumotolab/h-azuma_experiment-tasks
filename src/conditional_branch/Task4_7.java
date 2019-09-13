package conditional_branch;

// AtCoder Beginner Contest 019 - Bを改題
// https://atcoder.jp/contests/abc019/tasks/abc019_2

public class Task4_7 {

  public static void main(String[] args) {
    final String input = "3p2p4m3d3p1";

    // split "input" into one character
    final String[] inputArray = input.split("");
    
    // retrieve the first value
    int ans = Integer.parseInt(input.substring(0, 1));

    for (int i = 1; i < inputArray.length; i += 2) {
      final String operation = inputArray[i];
      final int secondValue = Integer.parseInt(inputArray[i + 1]);

      // change the calculation operation based on the character
      switch (operation) {
        case "p":
          ans += secondValue;
          break;
        case "m":
          ans -= secondValue;
          break;
        case "d":
          ans /= secondValue;
          break;
      }
    }

    System.out.println(ans);
  }
}
