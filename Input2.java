import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + " " + secondNumber);
        scanner.close();
    }
}
