import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double [] arr = new double[61];
        for(int i = 0;i <=60; i++){
            if(i == 0 || i == 1){
                arr[i] = i;
            }
            else{
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            
        }
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            System.out.printf("Fib(%d) = %.0f%n", x , arr[x]);
        }
    }
}
