import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            if(x == 0){
                break;
            }
            int count = 0;
            int sum = 0;
            for (int j = x; count < 5; j++) {
                if (j % 2 == 0) {
                    count++;
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}
