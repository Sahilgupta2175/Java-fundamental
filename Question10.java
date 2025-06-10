import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers to convert to miles:");
        System.out.print("Enter distance in kilometers: ");
        long kilometers = sc.nextLong();
        float miles = kilometers * 0.621371f;
        System.out.printf("%d kilometers is equal to %.2f miles%n", kilometers, (double) miles);
        sc.close();
    }
}
