public class MultiBranch {
    // recursion call 1 time
    static void singleBranch(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        singleBranch(num - 1);
    }

    // recursion call n time
    static void multiBranch(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        multiBranch(num - 1);
        multiBranch(num - 2);
        multiBranch(num - 3);
    }

    public static void main(String[] args) {
        // singleBranch(5);
        multiBranch(5);
    }
}
