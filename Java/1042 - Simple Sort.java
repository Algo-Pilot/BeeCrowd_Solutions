import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        if ((a > c && a > b) && b > c){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        else if ((a > c && a > b) && c > b){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        else if ((b > c && b > a) && a > c){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
            
        }
        else if ((b > c && b > a) && c > a){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        else if ((c > a && c > b) && b > a){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if ((c > a && c > b) && a > b){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
 
}
