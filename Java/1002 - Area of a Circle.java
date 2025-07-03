import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double s = 3.14159 * a * a;
        System.out.printf("A="+"%.4f%n", s);
    }
}
