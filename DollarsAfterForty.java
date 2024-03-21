import java.util.Scanner;

public class DollarsAfterForty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scan.nextDouble() / 100.0;

        System.out.print("Enter the initial investment amount: ");
        double initialInvestment = scan.nextDouble();

        System.out.print("Enter the annual contribution amount: ");
        double annualContribution = scan.nextDouble();

        double investment = initialInvestment;
        int years = 0;
      
        while (investment < 1000000) {
            years++;
            investment *= (1 + annualInterestRate);
            investment += annualContribution;
            System.out.println("Year " + years + ": $" + investment);
        }
        System.out.println("It takes " + years + " years to reach or exceed one million dollars.");
    }
}
