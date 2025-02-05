public class SumOfDigit {
    // Approach-2
    static int sumOfDigit(int num) {
        // Base case (1 time)
        if (num == 0) {
            return 0; // sum init value
        }
        // Small Problem
        // int sum = sumOfDigit(num / 10);
        // // Stack Fall
        // return sum + num % 10;
        return sumOfDigit(num / 10) + num % 10;
    }

    // Approach - 1
    static void sumOfDigit(int num, int sum) {
        // Base case
        if (num == 0) {
            System.out.println(sum);
            return; // Stop Recursion Calls
        }
        sumOfDigit(num / 10, sum + num % 10);
        // // Processing Logic
        // int lastDigit = num % 10;
        // sum = sum + lastDigit;
        // // small problem
        // sumOfDigit(num / 10, sum);
    }

    public static void main(String[] args) {
        // sumOfDigit(1234, 0);
        System.out.println(sumOfDigit(1234));
    }
}
