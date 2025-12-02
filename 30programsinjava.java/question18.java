import java.util.Scanner;
public class question18 {
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
    int vi;
    float a,s,t;
    System.out.println("enter intial velocity: ");
    vi=input.nextInt();
    System.out.println("enter Time: ");
    t=input.nextFloat();
    System.out.println("enter acceleration: ");
    a=input.nextFloat();
    s=vi*t+(1/2)*a*t*t;
    System.out.println(s);
    input.close();
   
}
    }

