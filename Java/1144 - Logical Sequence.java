import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =1; i<= num ; i++){
            System.out.printf("%d %d %d%n%d %d %d%n",i, i *i, i*i* i, i, i * i + 1, i * i * i + 1);
        }
    }
}
