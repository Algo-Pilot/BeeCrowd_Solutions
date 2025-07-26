import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count = 0;
            int sum = 0;
            for(int j = x; count < y; j++){
                if(j % 2 != 0){
                    count++;
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}
