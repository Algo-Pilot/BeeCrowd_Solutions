import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double plus = (a * 3.5) + (b*7.5);
        double avg = plus / 11.0;
        System.out.printf("MEDIA = " + "%.5f%n", avg);
    }
}
