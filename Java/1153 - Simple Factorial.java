import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = a;
        for(int i = 1;i< a; i++){
            fact = fact * (a - i);
        }
        System.out.println(fact);
    }
}
