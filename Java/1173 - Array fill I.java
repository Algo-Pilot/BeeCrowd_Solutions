import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[10];
        int value = sc.nextInt();
        N[0] = value;

        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        sc.close();
    }
}
