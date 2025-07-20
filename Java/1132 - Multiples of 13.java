import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(start > end){
            int a =  start;
            start = end;
            end = a;
        }
        int sum = 0;
        for(int i = start; i <=end; i++){
            if(i % 13 != 0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
