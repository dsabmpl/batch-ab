import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // 1 to N
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        if (num <= 1) {
            System.out.println("Not Prime Number");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
