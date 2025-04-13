import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] score = {"A+", "A0", "A-",
                          "B+", "B0", "B-",
                          "C+", "C0", "C-",
                          "D+", "D0", "D-",
                          "F"};

        double[] scoreNum = {4.3, 4.0, 3.7,
                             3.3, 3.0, 2.7,
                             2.3, 2.0, 1.7,
                             1.3, 1.0, 0.7,
                             0.0};

        String target = sc.nextLine();

        int index = 0;
        for (int i = 0; i < score.length; i++) {
            if (target.equals(score[i])) {
                index = i;
            }
        }

        System.out.println(scoreNum[index]);
    }
}