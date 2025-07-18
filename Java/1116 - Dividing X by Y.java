import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int a =  sc.nextInt();
        for(int i = 0; i < a; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if(y != 0){
                System.out.println(x / y);
            }
            else{
                System.out.println("divisao impossivel");
            }
        }
    }
}
