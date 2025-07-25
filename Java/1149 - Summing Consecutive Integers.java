import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(true){
            int b = sc.nextInt();
            int sum = 0;
            if(b > 0){
                for(int j = 0; j < b; j++){
                    sum += a;
                    a++;
                }
                System.out.println(sum);
                break;
            }
        }
    }
}
