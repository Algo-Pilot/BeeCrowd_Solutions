import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int duration = sc.nextInt();
        int hours = 0;
        int mins = 0;
        int sec = 0;
        if (duration > 3600) {
            hours = duration / 3600;
            duration = duration % 3600;
        }
        if (duration > 60) {
            mins = duration / 60;
        }
        sec = duration % 60;
        System.out.println(hours + ":" + mins + ":" + sec);

    }
}
