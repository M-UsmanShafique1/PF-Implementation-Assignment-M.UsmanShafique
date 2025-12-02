import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int ageyear, agemonth;
    System.out.println("Enter your age in year: ");
    ageyear =input.nextInt();
    agemonth = 12*ageyear;
System.out.println(agemonth);
input.close();
    }
}
