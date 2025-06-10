import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount, rate of interest, and time in years to calculate simple interest:");
        System.out.print("Enter principal amount: ");
        float principal = sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Enter time in years: ");
        int time = sc.nextInt();

        float simpleInterest = (principal * rate * time) / 100;
        System.out.printf("Simple interest for principal amount %.2f at rate %.2f%% for %d years is: %.2f%n", principal, rate, time, simpleInterest);
        sc.close();
    }
}
