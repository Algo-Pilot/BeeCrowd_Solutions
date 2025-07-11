import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        for(int i = 0; i < num; i++){
            int a = sc.nextInt();
            if(a % 2 == 0 && a>0){
                System.out.println("EVEN POSITIVE");
            }
            else if(a % 2 == 0 && a<0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(a % 2 != 0 && a<0){
                System.out.println("ODD NEGATIVE");
            }
            else if(a % 2 != 0 && a>0){
                System.out.println("ODD POSITIVE");
            }
            else{
                System.out.println("NULL");
            }
        }
    }
}
