import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc =  new Scanner(System.in);
        int time = sc.nextInt();
        int speed = sc.nextInt();
        int total_distance = time * speed;
        double fuel = total_distance / 12.0;
        System.out.printf("%.3f%n", fuel);
    }
}
