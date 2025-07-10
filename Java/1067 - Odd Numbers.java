import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner x  = new Scanner (System.in);
        int a = x.nextInt();
        for(int i =1 ; i <= a; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
