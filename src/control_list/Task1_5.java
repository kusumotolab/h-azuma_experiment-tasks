package control_list;

// AtCoder Beginner Contest 043 - Bを改題
// https://atcoder.jp/contests/abc043/tasks/abc043_b

import java.util.ArrayList;
import java.util.List;

public class Task1_5 {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        final String input = "0011B10";
        final String[] inputArray = input.split("");

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals("0") || inputArray[i].equals("1")) {
                list.add(inputArray[i]);
            } else {
                if (list.size() != 0) {
                    list.remove(list.size() - 1);
                }
            }
        }

        String output = "";
        for (int i = 0; i < list.size(); i++) {
            output += list.get(i);
        }

        System.out.println(output);
    }
}
