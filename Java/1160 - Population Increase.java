import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double aa = sc.nextDouble();
            double bb = sc.nextDouble();
            for (int j = 1; j <= 101; j++) {
                a += (int)(a * (aa / 100.0));
                b += (int)(b * (bb / 100.0));
                if (j > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
                else {
                    if (a > b) {
                        System.out.printf("%d anos.%n", j);
                        break;
                    }
                }
            }
        }
    }
}
