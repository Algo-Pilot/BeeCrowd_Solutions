import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count =0;
        for(int i = 1; count < a; i++){
            if(i % 4 == 0){
                System.out.println("PUM");
                count++;
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
}
