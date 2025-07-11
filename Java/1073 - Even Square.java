import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();
        int res;
        for (int i =1 ; i <= a ;i++){
            if (i % 2 == 0){
                res = i* i;
                System.out.println(i + "^2"+" = " + res);
            }
        }
        
    }
}
