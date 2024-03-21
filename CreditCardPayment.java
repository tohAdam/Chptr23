import java.util.Scanner;
import java.text.DecimalFormat;

public class CreditCardPayment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat();

        System.out.print("Enter the beginning balance: ");
        double balance = scan.nextDouble();

        System.out.print("Enter the monthly interest rate (in percentage): ");
        double monthlyInterestRate = scan.nextDouble() / 100.0;

        System.out.print("Enter the monthly payment amount: ");
        double monthlyPayment = scan.nextDouble();
        double totalPayments = 0;
        int month = 0;
      
        while (balance > 0) {
            month++;
            double interest = balance * monthlyInterestRate;
            balance += interest;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;

            if (balance < monthlyPayment) {
                monthlyPayment = balance;
                totalPayments += monthlyPayment;
                balance = 0;
            }

            System.out.println("Month: " + month + "        balance: $" + numform.format(balance) + "        total payments: $" + numform.format(totalPayments));
        }

        scanner.close();
    }
}
