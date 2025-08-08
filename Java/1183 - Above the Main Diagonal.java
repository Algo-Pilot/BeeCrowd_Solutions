import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double[][] arr = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double x = sc.nextDouble();
                arr[i][j] = x;
            }
        }
        double sum = 0;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = i + 1; j < 12; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        if (s.equals("S")) {
            System.out.printf("%.1f%n", sum);
        }
        else if (s.equals("M")) {
            System.out.printf("%.1f%n", (sum / count));
        }
    }
}
