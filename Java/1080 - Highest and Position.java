import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highest = 0;
        int input = 0;
        for(int i = 1; i <=100; i++){
            int a = sc.nextInt();
            if(a > highest){
                highest = a;
                input = i;
            }
        }
        System.out.println(highest);
        System.out.println(input);
    }
}
