import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner x  = new Scanner(System.in);
        int b = 0;
        double c =0;
        for(int i = 1; i <= 6; i++){
            double a = x.nextDouble();
            if (a > 0){
               b++;
               c  = c + a;
            }
        }
        System.out.println(b + " valores positivos");
        c = c / b;
        System.out.println(String.format("%.1f", c));
    }
}
