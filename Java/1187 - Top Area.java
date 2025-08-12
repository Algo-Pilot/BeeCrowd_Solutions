import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0); // Read operation (S for Sum, M for Average)
        double[][] M = new double[12][12];

        // Read the 12x12 matrix
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        int count = 0; // Counter for elements in the top area
        // Iterate through the matrix to find elements in the top area
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                // Condition for "top area": above main diagonal (j > i) AND above secondary diagonal (j < 11 - i)
                if (j > i && j < (11 - i)) {
                    soma += M[i][j];
                    count++;
                }
            }
        }

        // Perform sum or average based on the input operation
        if (O == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (O == 'M') {
            System.out.printf("%.1f\n", soma / count);
        }

        leitor.close();
    }
}
