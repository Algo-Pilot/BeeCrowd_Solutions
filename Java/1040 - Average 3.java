import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner  x  = new Scanner(System.in);
        float a = x.nextFloat();
        float b = x.nextFloat();
        float c = x.nextFloat();
        float d = x.nextFloat();
        float avg = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10 ;
        System.out.println("Media: " + String.format("%.1f", avg) );
        if (avg >= 7.0){
            System.out.println("Aluno aprovado.");
        }
        else if(avg < 5.0){
            System.out.println("Aluno reprovado.");
        }
        else if(avg >= 5.0 && avg <= 6.9){
            System.out.println("Aluno em exame.");
            float e = x.nextFloat();
            System.out.println("Nota do exame: "+ String.format("%.1f", e));
            avg = (avg + e) / 2;
            if (avg >= 5.0){
                System.out.println("Aluno aprovado.");
            }
            else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: "+ String.format("%.1f", avg));
            
        }
    }
}
