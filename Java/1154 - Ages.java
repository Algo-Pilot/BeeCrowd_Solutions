import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true) {
            int a = sc.nextInt();
            if (a < 0) {
                break;
            }
            else {
                sum += a;
                count++;
            }
        }
        System.out.printf("%.2f%n", sum / count);
    }
}
