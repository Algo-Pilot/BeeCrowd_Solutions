import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        char O = input.next().charAt(0);
        double[][] M = new double[12][12];
        double sum = 0;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = input.nextDouble();
                if (j < (11 - i)) {
                    sum += M[i][j];
                    count++;
                }
            }
        }

        if (O == 'S') {
            System.out.printf("%.1f\n", sum);
        } else if (O == 'M') {
            double average = sum / count;
            System.out.printf("%.1f\n", average);
        }

        input.close();
    }
}
