import java.util.Scanner;
public class question24{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int subject1,subject2,subject3,subject4,subject5,totalmark;
        float average;
    System.out.println("Enter subject1: ");
    subject1=input.nextInt();
     System.out.println("Enter subject2: ");
    subject2=input.nextInt();
     System.out.println("Enter subject3: ");
    subject3=input.nextInt();
    System.out.println("Enter subject4: ");
    subject4=input.nextInt();
    System.out.println("Enter subject5: ");
    subject5=input.nextInt();
    totalmark= subject1+subject2+subject3+subject4+subject5;
    average=totalmark/5;
    System.out.println("Total marks is= "+totalmark);
    System.out.println("Average marks is= "+average);
    input.close();
    }
}