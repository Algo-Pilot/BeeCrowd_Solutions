public class Main {
    public static void main(String[] args) {
        double s = 0;
        for(int i = 1;i <= 100; i++){
            double x = 1.0 / i;
            s += x;
        }
        System.out.printf("%.2f%n",s);
    }
}
