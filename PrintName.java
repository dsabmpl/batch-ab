public class PrintName {
    static void printName(int num) {
        // Base case or Termination Case
        if (num == 0) {
            return; // exit from the function call
        }
        System.out.println("Amit " + num); // Logic
        printName(num - 1); // Recursion Cycle (Tail Recursion)
    }

    public static void main(String[] args) {
        printName(5);
    }
}
