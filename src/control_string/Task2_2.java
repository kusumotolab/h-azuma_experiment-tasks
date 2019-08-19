package control_string;

// AtCoder Beginner Contest 007 - Bを改題
// https://atcoder.jp/contests/abc007/tasks/abc007_2

public class Task2_2 {
  public static void main(String[] args) {
    // alphabets stores "A" to "Z"
    final String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                                "U", "V", "W", "X", "Y", "Z"};

    // str1 is "OSUSHI", str2 is "OSECHI"
    final String[] str1 = {"O", "S", "U", "S", "H", "I"};
    final String[] str2 = {"O", "S", "E", "C", "H", "I"};

    for (int i = 0; i < str1.length; i++) {
      int str1Num = -1;
      int str2Num = -1;
      for (int j = 0; j < alphabets.length; j++) {
        if (str1[i].equals(alphabets[j])) {
          str1Num = j;
        }
        if (str2[i].equals(alphabets[j])) {
          str2Num = j;
        }
      }
      if (str1Num > str2Num) {
        System.out.println("OSECHI");
        break;
      } else if (str1Num < str2Num) {
        System.out.println("OSUSHI");
        break;
      }
    }
  }
}
