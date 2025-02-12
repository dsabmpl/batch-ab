public class RecDemo {

    static void show(int num) {
        // base case
        if (num == 0) {
            return;
        }
        // Logic
        System.out.println(num);
        // Small Problem
        show(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        show(5);
    }
}
