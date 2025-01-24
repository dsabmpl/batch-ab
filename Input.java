import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Scanner is a Buffer
        // Input - System.in
        int wordCount = 0;
        Scanner scanner = new Scanner("Hello How are You");
        while (scanner.hasNext()) {
            wordCount++;
            System.out.println(scanner.next());
        }
        System.out.println("Total Words " + wordCount);
        scanner.close();
    }
}
