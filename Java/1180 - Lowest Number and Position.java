import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int low = Integer.MAX_VALUE, pos = 0;
        for(int i = 0; i< a; i++){
            int y = sc.nextInt();
            if( y < low){
                low = y;
                pos = i;
            }
        }
        System.out.printf("Menor valor: %d%n",low);
        System.out.printf("Posicao: %d%n",pos);
    }
}
