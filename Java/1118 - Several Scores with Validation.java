import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        for (;;) {
            if (count == 2) {
                for (;;) {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    int a = sc.nextInt();
                    if (a < 1 && a > 2) {
                        continue;
                    }
                    else {
                        if (a == 2) {
                            break;
                        }
                        else if (a == 1) {
                            count = 0;
                            sum = 0;
                            break;
                        }
                    }
                }
            }
            if (count == 2) {
                break;
            }
            double x = sc.nextDouble();
            if (x >= 0 && x <= 10) {
                sum += x;
                count++;
                if (count == 2) {
                    System.out.printf("media = %.2f%n", (sum / 2));
                }
            }
            else {
                System.out.println("nota invalida");
            }
        }

    }
}
