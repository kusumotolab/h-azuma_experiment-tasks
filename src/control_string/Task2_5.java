package control_string;

// AtCoder Beginner Contest 045 - Bを改題
// https://atcoder.jp/contests/abc044/tasks/abc045_b

public class Task2_5 {
    public static void main(String[] args) {
        String handOfA = "bcaac";
        String handOfB = "acbba";
        String handOfC = "cacbb";
        char turn = 'a';
        char winner;

        while (true) {
            // can win when lose all characters in hand
            // determine the person who can act next by the head character
            if (turn == 'a') {
                turn = handOfA.charAt(0);
                handOfA = handOfA.substring(1);
                if (handOfA.length() == 0) {
                    winner = 'a';
                    break;
                }
            } else if (turn == 'b') {
                turn = handOfB.charAt(0);
                handOfB = handOfB.substring(1);
                if (handOfB.length() == 0) {
                    winner = 'b';
                    break;
                }
            } else if (turn == 'c') {
                turn = handOfC.charAt(0);
                handOfC = handOfC.substring(1);
                if (handOfC.length() == 0) {
                    winner = 'c';
                    break;
                }
            }
        }

        System.out.println(winner);
    }
}
