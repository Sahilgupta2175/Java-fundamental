import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius to convert to Fahrenheit:");
        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit%n", celsius, fahrenheit);
        sc.close();
    }
}
