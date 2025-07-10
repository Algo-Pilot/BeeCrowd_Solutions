import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner x  = new Scanner (System.in);
        int count = 0;
        int a = x.nextInt();
        for(int i = a ; count < 6; i++){
            if (i%2!=0){
                System.out.println(i);
                count++;
            }
        }
    }
}
