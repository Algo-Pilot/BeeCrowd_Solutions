import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }
        int count = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j < i && j < (11 - i)) { 
                    soma += M[i][j];
                    count++;
                }
            }
        }
        if (O == 'M') {
            soma /= count;
        }
        System.out.println(String.format("%.1f", soma));
        leitor.close();
    }
}
