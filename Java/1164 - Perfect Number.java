import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            int x = sc.nextInt();
            int sum = 0;
            for(int j = 1; j< x; j++){
                if(x % j == 0){
                    sum += j;
                }
            }
            if(sum == x){
                System.out.printf("%d eh perfeito%n",x);
            }
            else{
                System.out.printf("%d nao eh perfeito%n",x);
            }
        }
    }
}
