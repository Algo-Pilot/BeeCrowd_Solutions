import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner x  = new Scanner (System.in);
        double a = x.nextDouble();
        double b, c;
        if (a > 0.00 && a <= 2000.00){
            System.out.println("Isento");
        }
        else if (a > 2000.00 && a <= 3000.00){
            b  = a - 2000.00;
            b = b * 0.08;
            System.out.println("R$ " + String.format("%.2f", b));
        }
        else if (a > 3000.00 && a <= 4500.00){
            b = a - 3000.00;
            b  = (1000.00 * 0.08 ) +(b * 0.18);
            System.out.println("R$ " + String.format("%.2f", b));
        }
        else if(a > 4500.00){
            b = a - 4500.00;
            b  = (1000 * 0.08 ) + (1500.00 * 0.18 ) +(b * 0.28);
            System.out.println("R$ " + String.format("%.2f", b));
        }
    }
    
}
