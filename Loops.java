public class Loops {
    public static void main(String[] args) {
        // for , while , do while
        // for start to end
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int j = 1;
        while (j <= 10) {
            if (j % 2 == 0) {
                j++;
            } else {
                j += 2;
            }
        }
        // do while
        int k = 10;
        do {
            System.out.println("One time run");
        } while (k < 1);
    }
}
