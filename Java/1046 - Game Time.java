import java.util.Scanner;
public class Main{
    public static void main (String [] args ){
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        if (a - b == 0){
           System.out.println("O JOGO DUROU 24 HORA(S)"); 
        }
        else if (a > b){
            int v = (24 - a) + b;
            System.out.println("O JOGO DUROU " + v + " HORA(S)");
        }
        else{
            int v = Math.abs(a -b);
             System.out.println("O JOGO DUROU " + v + " HORA(S)");
        }
    }
}
