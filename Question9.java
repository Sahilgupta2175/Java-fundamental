import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three long integers to calculate their average:");
        System.out.print("Enter first long integer: ");
        long num1 = sc.nextLong();
        System.out.print("Enter second long integer: ");
        long num2 = sc.nextLong();
        System.out.print("Enter third long integer: ");
        long num3 = sc.nextLong();

        float avg = (num1 + num2 + num3) / 3;
        System.out.printf("Average of %d, %d, and %d is: %.2f%n", num1, num2, num3, avg);
        sc.close();
    }
}
