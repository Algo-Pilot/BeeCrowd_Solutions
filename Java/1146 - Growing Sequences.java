import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            if (x == 0) break;
            for (int i = 1; i <= x; i++) {
                if (i == x)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}
