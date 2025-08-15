import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operation = scanner.next().toUpperCase().charAt(0);
        double[][] matrix = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double sum = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i < 6) {
                for (int j = 12 - i; j < 12; j++) {
                    sum += matrix[i][j];
                    count++;
                }
            }
            else { // Lower half of the right area (rows 6-10)
                for (int j = i + 1; j < 12; j++) {
                    sum += matrix[i][j];
                    count++;
                }
            }
        }

        if (operation == 'S') {
            System.out.printf("%.1f%n", sum);
        }
        else if (operation == 'M') {
            System.out.printf("%.1f%n", sum / count);
        }

        scanner.close();
    }
}
