import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float x = a.nextFloat();
        float y = a.nextFloat();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if(x!=0 && y==0){
            System.out.println("Eixo X");
        }
        else if (x == 0 && y!=0){
            System.out.println("Eixo Y");
        }
        else if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
    }
}
