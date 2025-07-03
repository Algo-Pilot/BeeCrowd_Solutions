import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int greater = (int)(a+b+Math.abs(a-b))/2;
        int greatest = (int)(greater + c + Math.abs(greater - c))/2;
        System.out.println(greatest + " eh o maior");
    }
}
