import java.util.Scanner;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {
        /*
         * switch case - menu driven app + equality comparsion
         */
        // API
        System.out.println("1. Tea");
        System.out.println("2. Soft Drink");
        System.out.println("3. Burger");
        System.out.println("4. Pizza");
        System.out.println("Enter the Choice...");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        final int TEA = 1;
        final int DRINKS = 2;
        // switch - byte, short ,int, char
        // enum
        switch (choice) {
            case TEA:
                System.out.println("Rs 50");
                break;
            case DRINKS:
                System.out.println("Rs 70");
                break;
            case 3:
                System.out.println(" Rs 150");
                break;
            case 4:
                System.out.println("Rs 250");
                break;
            default:
                System.out.println("Wrong Choice...");
        }

        // string in switch - Java 7
        String ch = "Tea";
        switch (ch) {
            case "Tea":
                System.out.println("Rs 50");
        }

        // switch - Java 14 - switch with expression
        int e = 10 + 20;
        // : vs ->
        String expression = switch (ch) {
            case "tea" -> "Rs 50";
            case "drink" -> "Rs 100";
            case "burger" -> {
                int c = 10;
                int d = 20;
                int e1 = c * d;
                yield "Rs " + e1;
            }
            default -> "Wrong Value";
        };
        System.out.println(expression);
    }
}
