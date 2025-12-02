import java.util.Scanner;
public class question13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int R;
     float Pi=3.14f,Aera;
    System.out.println("Enter a radius");
    R=input.nextInt();
    Aera=Pi*R*R;
    System.out.println("Aera is this: "+Aera);
    input.close();
    }
}
