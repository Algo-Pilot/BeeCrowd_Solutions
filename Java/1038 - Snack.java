import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner  x  = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        if (a == 1){
            double m = 4.00 * b;
            System.out.println("Total: R$ " + String.format("%.2f", m) );
        }
        else if(a == 2){
            double m = 4.50 * b;
            System.out.println("Total: R$ " + String.format("%.2f", m) );
        }
        else if(a == 3){
            double m = 5.00 * b;
            System.out.println("Total: R$ " + String.format("%.2f", m) );
        }
        else if(a == 4){
            double m = 2.00 * b;
            System.out.println("Total: R$ " + String.format("%.2f", m) );
        }
        else if (a == 5){
            double m = 1.50 * b;
            System.out.println("Total: R$ " + String.format("%.2f", m) );
        }
        
    }
}
