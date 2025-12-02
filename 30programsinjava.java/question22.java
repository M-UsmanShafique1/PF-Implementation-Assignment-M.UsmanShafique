import java.util.Scanner;
public class question22 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);   
        String a,c;
        int b;
    float d;
    System.out.print("Enter your name: ");
        a = input.nextLine();
        System.out.print("Enter your age: ");
        b = input.nextInt();
        input.nextLine();  
        System.out.print("Enter your gender: ");
        c = input.nextLine();
        System.out.print("Enter your height: ");
        d = input.nextFloat();
        System.out.println("Your name is: " + a);
        System.out.println("Your age is: " + b);
        System.out.println("Your gender is: " + c);
        System.out.println("Your height is: " + d);
        input.close();
    }
}
