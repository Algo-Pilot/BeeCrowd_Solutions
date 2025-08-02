import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[20];
        for(int i = 0;i < 20; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 20; i++){
            System.out.printf("N[%d] = %d%n", i, arr[20-1-i]);
        }
    }
}
