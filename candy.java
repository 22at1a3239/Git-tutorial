import java.util.Scanner;

public class candy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == -1) break; 

            int[] candies = new int[n];
            int totalCandies = 0;

            for (int i = 0; i < n; i++) {
                candies[i] = scanner.nextInt();
                totalCandies += candies[i];
            }

            if (totalCandies % n != 0) {
                System.out.println(-1);
            } else {
                int target = totalCandies / n;
                int moves = 0;

               
                for (int i = 0; i < n; i++) {
                    if (candies[i] > target) {
                        moves += candies[i] - target;
                    }
                }

                System.out.println(moves);
            }
        }
    }
}
