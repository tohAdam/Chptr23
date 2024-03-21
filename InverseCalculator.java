import java.util.Scanner;

public class InverseCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of B: ");
        double B = scanner.nextDouble();

        if (B <= 0 || B > 1e6) 
            System.out.println("Invalid input. B should be a positive number less than or equal to 1e6.");
            return;
        if (B == 0) 
            System.out.println("Invalid input. Division by zero.");
            return;
      
        double guess = 0.000001;
        while (true) {
            double newX = guess * (2 - B * guess);

            if (Math.abs(newX - guess) < 1e-10) 
                System.out.println("1/" + B + " ≈ " + newX);
                break;
            guess = newX;
        }
    }
}
