public class Main {
    public static void main(String[] args) {
        double s = 1;
        double j = 1;
        for (int i = 3; i <= 39; i += 2) {
            j = j * 2;
            double x = i / j;
            s += x;
        }
        System.out.printf("%.2f%n", s);
    }
}
