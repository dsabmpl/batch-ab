public class CountEvenOdd {
    // Approach - 2
    static int[] evenOddCount(int num) {
        // Base case
        if (num == 0) {
            return new int[2]; // array default value in case of int array it is 0,0
            // [0,0]
        }
        // [0] = evenCount
        // [1] = oddCount
        int arr[] = evenOddCount(num - 1); // Small Problem
        // Stack Fall
        if (num % 2 == 0) {
            arr[0]++; // evenCount
        } else {
            arr[1]++;
        }
        return arr;
    }

    // Approach - 1
    static void evenOddCount(int num, int evenCount, int oddCount) {
        // Base case
        if (num == 0) {
            System.out.println("Even Count " + evenCount + " Odd Count " + oddCount);
            return;
        }
        // Logic
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
        // small problem
        evenOddCount(num - 1, evenCount, oddCount);

    }

    public static void main(String[] args) {
        // Call - Approach - 1
        // evenOddCount(5, 0, 0);

        // Call - Approach - 2
        int result[] = evenOddCount(5);
        System.out.println("Even Count " + result[0]
                + " Odd Count " + result[1]);
    }
}
