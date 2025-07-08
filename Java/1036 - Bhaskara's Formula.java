import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc  = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double r1 =0, r2 = 0;
        double con = (b * b) - (4 * a * c);
        if(a == 0 || con < 0  ){
            System.out.println("Impossivel calcular");
        }
        else{
            r1 = (-b + Math.sqrt(con))/ (2*a);
            r2 = (-b - Math.sqrt(con))/ (2*a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }
        
    }
}
