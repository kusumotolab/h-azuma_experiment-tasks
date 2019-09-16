package conditional_branch;

// AtCoder Beginner Contest 039 - Bを改題
// https://atcoder.jp/contests/abc039/tasks/abc039_c

import java.util.Arrays;
import java.util.List;

public class Task4_4 {
  public static void main(String[] args) {
    // "pastWeathers" is the list of weather until yesterday
    final List<String> pastWeathers = Arrays.asList("rainy", "rainy", "snowy", "cloudy", "sunny");

    // set initial today's temperature
    int temperature = 15;

    for (String weather : pastWeathers) {
      switch (weather) {
        case "sunny":
          temperature += 3;
          break;
        case "cloudy":
          // do nothing
          break;
        case "rainy":
          temperature -= 2;
          break;
        case "snowy":
          temperature /= 2;
          break;
      }
    }

    System.out.println(temperature);
  }
}
