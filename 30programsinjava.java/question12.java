import java.util.Scanner;
public class question12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float R,H,V;
      float Pi;
     Pi = 3.14f;
    System.out.println("Enter a radius");
    R=input.nextFloat();
    System.out.println("Enter a Height");
    H=input.nextFloat();
    V = Pi * R * R * H;
     System.out.println("Volume is =" +" "+V);
     input.close();
    }
}
