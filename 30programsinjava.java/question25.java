import java.util.Scanner;
public class question25{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        double s, area;
        System.out.print("Enter 1st side of triangle: ");
        a = input.nextInt();
        System.out.print("Enter 2nd side of triangle: ");
        b = input.nextInt();
        System.out.print("Enter 3rd side of triangle: ");
        c = input.nextInt();
        s = (a + b + c) / 2.0;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of triangle is: " + area);
        input.close();
    }
}

