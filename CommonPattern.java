public class CommonPattern {
    public static void main(String[] args) {
        int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print("*");
        // }
        // System.out.println(); // new line
        // }
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int row = 1; row <= n; row++) {
        // for (int space = 1; space <= n - row; space++) {
        // System.out.print(" ");
        // }
        // for (int col = 1; col <= row; col++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
