import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner x  = new Scanner(System.in);
        String a = new String();
        a = x.next();
        int day1 = x.nextInt();
        int hour1 = x.nextInt();
        String b = x.next();
        int min1 = x.nextInt();
        String c = x.next();
        int sec1 = x.nextInt();
        String d = x.next();
        int day2 = x.nextInt();
        int hour2 = x.nextInt();
        String e = x.next();
        int min2 = x.nextInt();
        String f = x.next();
        int sec2 = x.nextInt();
        int day = 0, hour=0, min=0,sec=0;
        sec = (60 -sec1) + sec2;
        if (sec >= 60){
            sec =sec - 60;
            min++;
        }
        min =  min + (60 - min1) + min2 - 1 ;
         if(min >= 60){
            min = min - 60;
            hour++;
        }
        hour =hour + (24 - hour1) + hour2 - 1;
        if (hour >= 24){
            hour = hour - 24;
            day++;
        }
        day =day + day2 - day1 - 1;
        System.out.println(day +" dia(s)");
        System.out.println(hour +" hora(s)");
        System.out.println(min +" minuto(s)");
        System.out.println(sec +" segundo(s)");
        
        
        
        
    }
}
