import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            int x = sc.nextInt();
            boolean flag = true;
            for(int j = 1; j<x; j++){
                if(x % j == 0){
                    if(j != 1){
                        System.out.printf("%d nao eh primo%n", x);
                        flag = false;
                        break;
                    }
                }
            }
            if(flag == true){
                System.out.printf("%d eh primo%n", x);
            }
        }
    }
}
