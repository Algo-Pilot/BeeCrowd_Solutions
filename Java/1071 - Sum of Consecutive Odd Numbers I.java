import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner  x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int sum = 0;
        if (a > b){
            for (int i = b + 1; i < a ; i++){
                if (i % 2 != 0){
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
        else if ( a < b){
            for (int i = a + 1; i > b ; i++){
                if (i % 2 != 0){
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
    }
}
