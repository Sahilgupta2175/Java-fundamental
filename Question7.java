import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of the rectangle to calculate its area:");
        System.out.print("Enter length: ");
        float length = sc.nextFloat();
        System.out.print("Enter width: ");
        float width = sc.nextFloat();

        float perimeter = 2 * (length + width);
        System.out.printf("Perimeter of the rectangle with length %.2f and width %.2f is: %.2f%n", length, width, perimeter);
        sc.close();
    }
}
