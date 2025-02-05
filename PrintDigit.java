public class PrintDigit {

    static void printDigit(int num) {
        // Base case or Termination Case
        if (num == 0) {
            return; // exit from the function
        }
        // Head Recursion
        printDigit(num / 10); // Recursion Cycle + Small Problem
        // Stack Fall
        System.out.println(num % 10);
    }

    public static void main(String[] args) {
        printDigit(12345);
    }
}
