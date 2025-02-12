public class Fact {

    static int fact(int num) {
        // base case
        if (num == 1) {
            return num;
        }
        int r = fact(num - 1);
        return r * num;
    }

    static void fact(int num, int result) {
        // base case
        if (num == 1) {
            System.out.println(result);
            return;
        }
        // small problem
        fact(num - 1, num * result);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        // fact(5, 1);
        // 5 * 4 * 3 * 2 * 1 = 120
    }
}
