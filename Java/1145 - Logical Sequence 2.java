import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            if (i % a == 0) {
                System.out.println(i);
            }
            else {
                System.out.printf("%d ", i);
            }
        }
    }
}
