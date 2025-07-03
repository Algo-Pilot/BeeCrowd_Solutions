import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println(amount);
        int note_hundred = 0;
        int note_fifty = 0;
        int note_twenty = 0;
        int note_ten = 0;
        int note_five = 0;
        int note_two = 0;
        int note_one = 0;
        if (amount >= 100) {
            note_hundred = amount / 100;
            amount = amount - (note_hundred * 100);
        }
        if (amount >= 50) {
            note_fifty = amount / 50;
            amount = amount - (note_fifty * 50);
        }
        if (amount >= 20) {
            note_twenty = amount / 20;
            amount = amount - (note_twenty * 20);
        }
        if (amount >= 10) {
            note_ten = amount / 10;
            amount = amount - (note_ten * 10);
        }
        if (amount >= 5) {
            note_five = amount / 5;
            amount = amount - (note_five * 5);
        }
        if (amount >= 2) {
            note_two = amount / 2;
            amount = amount - (note_two * 2);
        }
        if (amount >= 1) {
            note_one = amount / 1;
        }

        System.out.println(note_hundred + " nota(s) de R$ 100,00");
        System.out.println(note_fifty + " nota(s) de R$ 50,00");
        System.out.println(note_twenty + " nota(s) de R$ 20,00");
        System.out.println(note_ten + " nota(s) de R$ 10,00");
        System.out.println(note_five + " nota(s) de R$ 5,00");
        System.out.println(note_two + " nota(s) de R$ 2,00");
        System.out.println(note_one + " nota(s) de R$ 1,00");
    }
}
