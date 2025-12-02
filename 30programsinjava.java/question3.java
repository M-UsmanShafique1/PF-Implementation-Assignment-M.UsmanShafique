public class question3 {
public static void main(String[] args) {

        int a = 5, b = 10, temp;

        System.out.println("Original values: " + a);
        System.out.println(b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Interchanged values: " + a);
        System.out.println(b);
    }
}

