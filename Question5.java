import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height of the cylinder to calculate its volume:");
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        float volume = (float) (Math.PI * radius * radius * height);
        System.out.printf("Volume of the cylinder with radius %.2f and height %.2f is: %.2f%n", radius, height, volume);
        sc.close();
    }
}
