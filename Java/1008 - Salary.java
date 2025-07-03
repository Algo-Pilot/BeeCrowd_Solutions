import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double calc = b * c;
        System.out.println("NUMBER = "+ a);
        System.out.printf("SALARY = U$ "+"%.2f%n", calc);
        
    }
}
