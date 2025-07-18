import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        for (int i = 0; count < 2; i++) {
            double x = sc.nextDouble();
            if(x>=0 && x <=10){
                sum += x;
                count++;
            }
            else{
                System.out.println("nota invalida");
            }
        }
        System.out.println("media = "  + (sum / 2));
    }
}
