import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner x  = new Scanner(System.in);
        int even = 0, positive = 0, odd = 0, negative = 0;
        for(int i = 1; i <=5; i++){
            int a = x.nextInt();
            if (a > 0){
                positive++;
            }
            else if (a < 0){
                negative++;
            }
            if (a % 2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}
