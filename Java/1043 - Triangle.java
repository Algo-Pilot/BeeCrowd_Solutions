import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner x = new Scanner (System.in);
        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();
        if ((((a + b) > c) && ((b + c)>a)) && ((a + c) > b)) {
            double p = a + b + c;
            System.out.println("Perimetro = "+ String.format("%.1f", p));
        }
        else{
            double area = ((a + b) / 2.0) * c;
            System.out.println("Area = "+ String.format("%.1f", area));
        }
    }
 
}
