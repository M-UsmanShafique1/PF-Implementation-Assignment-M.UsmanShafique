import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
         float F,C;
         Scanner input=new Scanner(System.in);
    System.out.println("Enter temperature in Fahrenheit: ");
    F=input.nextFloat();
   C = (5.0f/9.0f)*(F - 32);
   System.out.println("Temperature in Celsius : "+C);
   input.close();
    }
    
}
