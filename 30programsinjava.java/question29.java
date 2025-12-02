import java.util.Scanner;
public class question29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a value: ");
        n = input.nextInt();
        if (n > 100) {
            System.out.println("The number is greater than 100");
        }
        input.close();
    }
}
