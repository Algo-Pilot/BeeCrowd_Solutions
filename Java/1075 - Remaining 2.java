import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        for(int i = 0; i < 10000; i++){
            if(i % num == 2){
                System.out.println(i);
            }
        }
    }
}
