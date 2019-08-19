package control_string;

// AtCoder Beginner Contest 044 - Bを改題
// https://atcoder.jp/contests/abc044/tasks/abc044_b

public class Task2_4 {

  public static void main(String[] args) {
    final String str = "1202141";

    // "alphabet" stores the number of occurence of each alphabet in "str"
    int[] number = new int[10];
    for (int i = 0; i < str.length(); i++) {
      int index = str.charAt(i) - '0'; // convert char to index
      number[index]++;
    }

    int answer = 0;
    for (int i = 0; i < 10; i++) {
      if (number[i] == 0) {
        answer = i;
        break;
      }
    }

    System.out.println("the missing number is " + answer);
  }
}
