import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int x = 0;
        int y = 1;
        System.out.printf("%d %d ", x, y);
        for (int i = 0; i < a - 2; i++) {
            int sum = x + y;
            if (i == a - 3) {
                System.out.printf("%d%n", sum);
            }
            else {
                System.out.printf("%d ", sum);
            }
            x = y;
            y = sum;
        }
    }
}
