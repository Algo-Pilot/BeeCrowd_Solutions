import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(true){
            int b = sc.nextInt();
            int sum = 0;
            int count = 0;
            if(b > a){
                while(true){
                    sum += a;
                    a++;
                    count++;
                    if(sum > b) break;
                }
                System.out.println(count);
                break;
            }
        }
    }
}
