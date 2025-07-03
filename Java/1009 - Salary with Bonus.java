import java.util.Scanner;
public class Main{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double bonus = (b * 15)/100;
        // System.out.println(bonus);
        // double fi = (long)((a + bonus)*100)/100.0;
        double fi = a + bonus;
        System.out.printf("TOTAL = R$ "+"%.2f%n",fi);
    }
}
