import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent to calculate power:");
        System.out.print("Enter base: ");
        long base = sc.nextLong();
        System.out.print("Enter exponent: ");
        long exponent = sc.nextLong();

        long result = (long) Math.pow(base, exponent);
        System.out.printf("Result of %.2f raised to the power of %d is: %.2f%n", (double) base, exponent,
                (double) result);
        sc.close();
    }
}
