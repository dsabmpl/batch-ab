public class BinaryToDecimal {

    static int binaryToDecimal(int num, int pow, int sum) {
        // Base case
        if (num == 0) {
            return sum;
        }
        // Logic
        int lastDigit = num % 10;
        sum = sum + lastDigit * (int) Math.pow(2, pow);
        // Small Problem
        return binaryToDecimal(num / 10, pow + 1, sum);
    }

    public static void main(String[] args) {
        int decimalNumber = binaryToDecimal(1010, 0, 0);
        System.out.println(decimalNumber);
    }
}
