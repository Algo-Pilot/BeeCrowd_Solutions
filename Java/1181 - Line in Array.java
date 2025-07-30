import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); // Read the line number
        char T = sc.next().charAt(0); // Read the operation type ('S' or 'M')

        double[][] M = new double[12][12]; // Declare a 12x12 double array

        // Read the matrix elements
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double result = 0.0;

        // Calculate sum of the elements in line L
        for (int j = 0; j < 12; j++) {
            result += M[L][j];
        }

        // Apply operation based on T
        if (T == 'M') {
            result /= 12.0; // Calculate average if T is 'M'
        }

        // Print the result formatted to one decimal place
        System.out.printf("%.1f%n", result);

        sc.close(); // Close the scanner
    }
}
