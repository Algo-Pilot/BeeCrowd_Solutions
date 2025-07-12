import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test =  sc.nextInt();
        int total = 0;
        int coelho = 0;
        int rato = 0;
        int sapo = 0;
        for(int i = 1; i <=test; i++){
            int a = sc.nextInt();
            String b = sc.next();
            if(b.equals("C")){
                coelho = coelho + a;
            }
            else if(b.equals("R")){
                rato = rato + a;
            }
            else if (b.equals("S")){
                sapo = sapo + a;
            }
            total =total + a;
        }
        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+coelho);
        System.out.println("Total de ratos: "+rato);
        System.out.println("Total de sapos: " + sapo);
        double pc = ((double)coelho / (double)total) * 100.0;
        System.out.printf("Percentual de coelhos: %.2f %%\n", pc);
        double pr = ((double)rato / (double)total) * 100.0;
        System.out.printf("Percentual de ratos: %.2f %%\n", pr);
        double ps = ((double)sapo / (double)total) * 100.0;
        System.out.printf("Percentual de sapos: %.2f %%\n", ps);
    }
}
