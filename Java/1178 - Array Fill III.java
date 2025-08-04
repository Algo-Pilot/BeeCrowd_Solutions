import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f%n", i, x);
            x /= 2.0;
        }
    }
}
