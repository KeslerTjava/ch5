import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first length: ");
        int a = in.nextInt();

        System.out.print("Enter second length: ");
        int b = in.nextInt();

        System.out.print("Enter third length: ");
        int c = in.nextInt();

        boolean canFormTriangle = a < b + c && b < a + c && c < a + b;

        if (a <= 0 || b <= 0 || c <= 0 ) {
            System.out.println("Invalid lengths" );
        } else {
            System.out.println("Cannot form a triangle.");
        }
    }
}
