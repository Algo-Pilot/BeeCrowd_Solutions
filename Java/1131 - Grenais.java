import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int inter = 0, gremio = 0, empates = 0, round = 0;
        for(;;){
            if(check == true){
                System.out.println("Novo grenal (1-sim 2-nao)");
                int a = sc.nextInt();
                if(a == 2){
                    break;
                }
            }
            round++;
            int in = sc.nextInt();
            int gr = sc.nextInt();
            if(in > gr){
                inter++;
                check = true;
            }
            else if(gr > in){
                gremio++;
                check = true;
            }
            else{
                empates++;
                check = true;
            }
        }
        System.out.println(round+" grenais");
        System.out.println("Inter:"+inter);
        System.out.println("Gremio:"+gremio);
        System.out.println("Empates:"+empates);
        if(inter> gremio){
            System.out.println("Inter venceu mais");
        }
        else if(gremio>inter){
            System.out.println("Gremio venceu mais");
        }
        else{
            System.out.println("Não houve vencedor");
        }
        
    }
}
