public class Power {
    static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        // Small Problem
        int smallResult = power(num, pow - 1);
        return smallResult * num;
    }

    public static void main(String[] args) {
        int result = power(2, 5);
        System.out.println(result);
    }
}
