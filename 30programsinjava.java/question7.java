import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int  PF, IC, CG, totalmark;
        float average;
        long rollno;
    System.out.println("Enter roll no: ");
    rollno = input.nextLong();
System.out.println("Enter PF marks; ");
PF=input.nextInt();
System.out.println("Enter IC marks; ");
IC=input.nextInt();
System.out.println("Enter CG marks; ");
CG=input.nextInt();
System.out.println(rollno);
    totalmark= PF+IC+CG;
    average = (float) totalmark / 3;
    input.close();
    System.out.println("Total Mark="+totalmark+"    "+"Averagemakrs = "+average);
    }
    
}
