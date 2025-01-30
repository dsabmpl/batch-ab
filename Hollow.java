public class Hollow {
    public static void main(String[] args) {
        int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row == n || col == 1 || row == col) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                if (row == 1 || col == 1 || col == n - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
