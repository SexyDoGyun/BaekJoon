import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i <= n/2; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if (i < list.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
