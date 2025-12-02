import java.util.Scanner;
public class question28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, s;
        System.out.print("Enter value of a: ");
        a = input.nextInt();
        System.out.print("Enter value of b: ");
        b = input.nextInt();
        System.out.print("Enter value of c: ");
        c = input.nextInt();
        s = b * b - 4 * a * c;
        System.out.println("The value of disc is: " + s);
        input.close();
    }
}
