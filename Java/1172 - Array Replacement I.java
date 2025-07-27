import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< 10; i++){
            int a = sc.nextInt();
            if(a == 0 || a < 0){
                System.out.printf("X[%d] = 1%n",i);
            }
            else{
                System.out.printf("X[%d] = %d%n",i,a);
            }
        }
    }
}
