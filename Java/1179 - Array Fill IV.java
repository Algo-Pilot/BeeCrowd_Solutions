import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        int[] par = new int[5];
        int im = 0;
        int[] impar = new int[5];
        for (int i = 0; i < 15; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                par[p] = a;
                p++;
            }
            else {
                impar[im] = a;
                im++;
            }
            if (im == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("impar[%d] = %d%n", j, impar[j]);
                }
                im = 0;
            }
            if (p == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("par[%d] = %d%n", j, par[j]);
                }
                p = 0;
            }
        }
        for (int j = 0; j < im; j++) {
            System.out.printf("impar[%d] = %d%n", j, impar[j]);
        }
        for (int j = 0; j < p; j++) {
            System.out.printf("par[%d] = %d%n", j, par[j]);
        }
    }
}
