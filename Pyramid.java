public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int space = 1; space <= n - row + 1; space++) {
        // System.out.print(" ");
        // }
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // Odd
        // for (int row = 1; row <= n; row++) {
        // for (int space = 1; space <= n - row + 1; space++) {
        // System.out.print(" ");
        // }
        // int odd = row * 2 - 1;
        // for (int col = 1; col <= odd; col++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        int val = 1;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row + 1; space++) {
                System.out.print(" ");
            }
            String str = String.valueOf(val);
            for (int j = 0; j < str.length(); j++) {
                System.out.print(str.charAt(j) + " ");
            }
            val = val * 11;
            System.out.println();
        }
    }
}
