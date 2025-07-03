import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double consumption = a / b; 
        System.out.printf("%.3f km/l%n",consumption);
    }
}
