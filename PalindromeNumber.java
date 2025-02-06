class PalindromeNumber {

    static boolean isPalindrome(int num, int copy, int result) {
        // Termination Case or Base Case
        if (num == 0) {
            return result == copy;
        }
        // Small Problem
        // num/10 - make a number small
        // Processing Logic
        int lastDigit = num % 10; // get the last digit
        result = result * 10 + lastDigit; // place it (Ten Place, Hundred Place)
        return isPalindrome(num / 10, copy, result);
    }

    public static void main(String[] args) {
        boolean r = isPalindrome(123, 123, 0);
        System.out.println(r ? "Palindrome Number" : "Not Palindrome Number");
    }
}