public class SwapDigitPos {
    public static void main(String[] args) {
        int num = 32145;
        int position = 0; // count
        int sum = 0;
        while (num != 0) {
            // get the last digit
            int lastDigit = num % 10;
            position++;
            int val = position * (int) Math.pow(10, lastDigit - 1);
            sum = sum + val;
            num = num / 10; // make the number small
        }
        System.out.println(sum);

    }
}
