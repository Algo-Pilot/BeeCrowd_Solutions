import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        double a = x.nextDouble();
        double b, c;
        if (a > 0 && a <= 400.00){
            b = a * 0.15;
            c = b + a;
            System.out.println("Novo salario: " + String.format("%.2f", c));
            System.out.println("Reajuste ganho: " + String.format("%.2f", b ));
            System.out.println("Em percentual: 15 %");
        }
        else if (a > 400.00 && a <= 800.00){
            b = a * 0.12;
            c = b + a;
            System.out.println("Novo salario: " + String.format("%.2f", c));
            System.out.println("Reajuste ganho: " + String.format("%.2f", b ));
            System.out.println("Em percentual: 12 %");
        }
        else if (a > 800.00 && a <= 1200.00){
            b = a * 0.1;
            c = b + a;
            System.out.println("Novo salario: " + String.format("%.2f", c));
            System.out.println("Reajuste ganho: " + String.format("%.2f", b ));
            System.out.println("Em percentual: 10 %");
        }
        else if (a > 1200.00 && a <= 2000.00){
            b = a * 0.07;
            c = b + a;
            System.out.println("Novo salario: " + String.format("%.2f", c));
            System.out.println("Reajuste ganho: " + String.format("%.2f", b ));
            System.out.println("Em percentual: 7 %");
        }
        else if (a > 2000.00){
            b = a * 0.04;
            c = b + a;
            System.out.println("Novo salario: " + String.format("%.2f", c));
            System.out.println("Reajuste ganho: " + String.format("%.2f", b ));
            System.out.println("Em percentual: 4 %");
        }
    }
}
