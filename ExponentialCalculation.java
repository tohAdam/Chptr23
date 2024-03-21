import java.util.Scanner;

public class ExponentialCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scan.nextDouble();

        double term = 1.0;
        double sum = 1.0;
        int n = 1;

        System.out.println("n: " + n + "     term: " + term + "          sum: " + sum);

        while (Math.abs(term) >= 1.0E-12) {
            term *= x / n;
            sum += term;
            n++;
            System.out.println("n: " + n + "     term: " + term + "          sum: " + sum);
        }

        System.out.println("\nmy   e^x: " + sum);
        System.out.println("real e^x: " + Math.exp(x));
    }
}
