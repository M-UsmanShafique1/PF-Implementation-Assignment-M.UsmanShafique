import java.util.Scanner;

public class question30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a value: ");
        n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is even: " + n);
        } else {
            System.out.println("The number is odd: " + n);
        }
        input.close();
    }
}