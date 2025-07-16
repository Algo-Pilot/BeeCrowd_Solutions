import java.util.Scanner;

public class Main { // Or URI_1099, depending on the platform's naming convention
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); // Read the number of test cases

        for (int i = 0; i < N; i++) {
            int X = input.nextInt();
            int Y = input.nextInt();
            int sumOfOdds = 0;

            // Determine the smaller and larger number to iterate correctly
            int start = Math.min(X, Y);
            int end = Math.max(X, Y);

            // Iterate through the numbers between start and end (exclusive)
            for (int j = start + 1; j < end; j++) {
                if (j % 2 != 0) { // Check if the number is odd
                    sumOfOdds += j;
                }
            }
            System.out.println(sumOfOdds); // Print the sum for the current test case
        }
        input.close();
    }
}
