import java.util.Scanner;
public class question19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    int a,b,c;
    System.out.println("enter your age in year: ");
    a=input.nextInt();
    b=a*12;
    System.out.println("The age in month is: "+b);
    c=a*360;
    System.out.println("The age in year is: "+c);
    input.close();
    }
}
