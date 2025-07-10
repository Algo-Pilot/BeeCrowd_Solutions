import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner x  = new Scanner(System.in);
        int b = 0;
        double c;
        for(int i = 1; i <= 5; i++){
            double a = x.nextDouble();
            c = a % 2;
            if (c == 0){
               b++;
            }
        }
        System.out.println(b + " valores pares");
    }
}
