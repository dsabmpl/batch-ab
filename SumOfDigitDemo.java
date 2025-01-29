class SumOfDigitDemo {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while (num != 0) {
            // Step - 1 Get the Last Digit
            int lastDigit = num % 10;

            // Step - 2 Sum of Digit
            sum = sum + lastDigit;

            // Step -3 Make the number small
            num = num / 10;
        }
        System.out.println(sum);
    }
}