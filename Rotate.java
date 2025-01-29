public class Rotate {
    public static void main(String[] args) {
        int num = 12345;
        int rotation = 8;
        int count = 0;
        int copy = num;
        // Count the digit
        while (num != 0) {
            num = num / 10;
            count++;
        }

        rotation = rotation % count;
        if (rotation < 0) {
            rotation = rotation + count;
        }
        num = copy;
        int power = (int) Math.pow(10, rotation);
        int right = num % power;
        int left = num / power;
        int val = right * (int) Math.pow(10, (count - rotation)) + left;
        System.out.println(val);

    }
}
