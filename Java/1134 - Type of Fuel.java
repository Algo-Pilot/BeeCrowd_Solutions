import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int trig = 0;
        int gasoline = 0, alcohol = 0, disel = 0;
        while(trig != 4){
            int a = sc.nextInt();
            if(a == 1 || a == 2 || a == 3 || a == 4){
                if(a == 1){
                    alcohol++;
                }
                else if(a == 2){
                    gasoline++;
                }
                else if(a == 3){
                    disel++;
                }
                else{
                    trig = 4;
                }
            }
        }
        System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n",alcohol, gasoline, disel);
    }
}
