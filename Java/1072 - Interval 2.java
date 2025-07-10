import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();
        int c1 = 0 , c2 = 0;
        for (int i =1 ; i <= a ;i++){
            int b = x.nextInt();
            if (b >= 10 && b<=20){
                c1++;
            }
            else{
                c2++;
            }
        }
        System.out.println(c1+" in");
        System.out.println(c2+" out");
        
    }
}
