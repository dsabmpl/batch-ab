public class CountNumberOfZeros {

    static int countNumberOfZeros(int num) {
        if (num == 0) {
            return 0; // count init value
        }
        // small Problem
        int count = countNumberOfZeros(num / 10);
        int digit = num % 10;
        return count + (digit == 0 ? 1 : 0);

    }

    public static void main(String[] args) {
        int r = countNumberOfZeros(10203040);
        System.out.println(r);
    }
}
