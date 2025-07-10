import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
 
}
