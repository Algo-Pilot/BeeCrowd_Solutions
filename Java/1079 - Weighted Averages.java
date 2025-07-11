import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            double a = sc.nextDouble() * 2;
            double b = sc.nextDouble() * 3;
            double c = sc.nextDouble() * 5;
            double avg = (a + b + c)/10.0;
            System.out.printf("%.1f%n", avg);
        }
    }
}
