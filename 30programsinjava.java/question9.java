import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     int a, b, c, d;
     System.out.println("Enter 1st an integer: ");
     a=input.nextInt();
     System.out.println("Enter an 2st integer: ");
     b=input.nextInt();
     System.out.println("Enter an 3rd integer: ");
     c=input.nextInt();
      System.out.println("Enter an 4th integer: ");
      d=input.nextInt();
      if(a>b&&a>c&&a>d)
      System.out.println("A is maximum");
     else
     System.out.println("A is minimum");
     if(b>a&&b>c&&b>d)
         System.out.println("B is maximum");
     else
       System.out.println("B is minimum");
         if(c>b&&c>a&&c>d)
         System.out.println("C is maximum");
     else
      System.out.println("C is minimum");
     if(d>a&&d>c&&d>b)
       System.out.println("D is maximum");
     else
       System.out.println("D is minimum");
    input.close();
}
    }
    

