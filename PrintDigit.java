public class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int count = 0;
        // Step - 1 Count the Digit
        while (num != 0) {
            num = num / 10; // make the number small
            count++;
        }
        num = copy;
        int pow = (int) Math.pow(10, count - 1);
        while (num != 0) {
            System.out.println(num / pow);
            num = num % pow; // make the number small
            pow = pow / 10; // make the power small
        }

    }
}
