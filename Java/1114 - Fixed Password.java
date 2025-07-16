import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        for(;;){
            int b = sc.nextInt();
            if(b == 2002){
                System.out.println("Acesso Permitido");
                break;
            }
            else{
                System.out.println("Senha Invalida");
            }
        }
    }
}
