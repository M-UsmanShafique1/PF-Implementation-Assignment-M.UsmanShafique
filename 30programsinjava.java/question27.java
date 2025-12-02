import java.util.Scanner;

public class question27{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, s, d;
        System.out.print("Enter Time in hours: ");
        a = input.nextInt();
        System.out.print("Enter Time in seconds: ");
        b = input.nextInt();
        System.out.print("Enter Time in minutes: ");
        c = input.nextInt();
        s = a * 3600;   
        d = c * 60;     
        System.out.println("Time in seconds: " + b);
        System.out.println("Time in seconds from hours: " + s);
        System.out.println("Time in seconds from minutes: " + d);
        input.close();
    }
}
