import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle to calculate its area:");
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();

        float area = (float) (Math.PI) * radius * radius;
        System.out.printf("Area of the circle with radius %.2f is: %.2f%n", radius, area);
        sc.close();
    }
}
