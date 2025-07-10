import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        int d = x.nextInt();
        int k, l;
        if (a == c){
            if (d > b){
                k = d - b;
                System.out.println("O JOGO DUROU 0 HORA(S) E " + k +" MINUTO(S)");
            }
            else if (b == d){
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            }
            else if(b > d){
                l = (24 - a) + c - 1;
                k = (60 - b) + d;
                if( k >= 60){
                    l++;
                    k = k - 60;
                    System.out.println("O JOGO DUROU "+ l +" HORA(S) E " + k +" MINUTO(S)");
                }
                else{
                    System.out.println("O JOGO DUROU "+ l +" HORA(S) E " + k +" MINUTO(S)");
                } 
            }
            
        }
        if (c > a){
            l = c - a - 1;
            k = (60 - b) + d;
            if( k >= 60){
                l++;
                k = k - 60;
                System.out.println("O JOGO DUROU "+ l +" HORA(S) E " + k +" MINUTO(S)");
            }
            else{
                System.out.println("O JOGO DUROU "+ l +" HORA(S) E " + k +" MINUTO(S)");
            }
            
        }
        else if (c < a){
            l = (24 - a) + c - 1;
            k = (60 - b) + d;
            if( k >= 60){
                l++;
                k = k - 60;
                System.out.println("O JOGO DUROU "+ l +" HORA(S) E " + k +" MINUTO(S)");
            }
            else{
                System.out.println("O JOGO DUROU "+ l +" HORA(S) E " + k +" MINUTO(S)");
            } 
            
        }
    }
}
