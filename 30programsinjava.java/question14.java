import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float millimeter,inches ;
    System.out.println("Enter millimetr; ");
    millimeter=input.nextFloat();
    inches = millimeter / 22.4f;
    System.out.println(inches);
    input.close();
    }
}
