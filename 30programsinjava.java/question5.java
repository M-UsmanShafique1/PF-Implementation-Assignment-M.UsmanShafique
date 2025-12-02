import java.util.Scanner;
public class question5 {
    public static void main(String[] arg){ 

     Scanner input =new Scanner(System.in);
     int a, b, sum, product;
     System.out.println("Enter a number ");
     a = input.nextInt();
     System.out.println("Enter a number ");
     b = input.nextInt();
     input.close();
      sum = a + b;
     product=a*b;
     System.out.println("The sum is "+sum);
     System.out.println("The product is "+product);
    }
}
