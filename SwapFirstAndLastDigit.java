public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        int num = 78429;
        int copy = num;
        // get the last Digit
        int lastDigit = num % 10;
        // get the first digit
        // 1.1 count the digit
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        num = copy;
        int pow = (int) Math.pow(10, count - 1);
        int firstDigit = num / pow;
        int mid = num % pow;
        mid = mid / 10;
        mid = mid * 10;
        int val = lastDigit * pow + mid + firstDigit;
        System.out.println(val);

    }
}
