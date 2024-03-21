import java.util.Scanner;

public class HailstoneSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        int length = 0;
        int max = N;

        while (N != 1) {
            length++;
            if (N % 2 == 0) 
                N /= 2; //
            else 
                N = 3 * N + 1;
            max = Math.max(max, N);
            System.out.println(N);
        }
        System.out.println("Length of the sequence: " + (length + 1));
        System.out.println("Maximum integer in the sequence: " + max);
    }
}
