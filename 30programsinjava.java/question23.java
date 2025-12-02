import java.util.Scanner;
public class question23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         float a, b,c,d;
    System.out.println("Enter radius of circle: ");
    a=input.nextFloat();
    b=3.14f;
    c=b*a*a;
    d=2*b*b;
    System.out.println("The area of circle is:  "+c);
     System.out.println("The circumfence of circle is:  "+d);
     input.close();
    }
    
}
