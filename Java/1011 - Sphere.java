import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double sp = 4 /3.0;
        double pi = 3.14159;
        R = Math.pow(R,3);
        double fin = R * pi * sp;
        System.out.printf("VOLUME = %.3f%n", fin);
    }
}
