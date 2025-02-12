public class Convert {
    static String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    static void convert(int num) {
        if (num == 0) {
            return;
        }
        convert(num / 10);
        int digit = num % 10;
        System.out.print(arr[digit] + " ");
        // if(digit == 1){
        // System.out.println("one");
        // }
    }

    public static void main(String[] args) {
        convert(12345);
        System.out.println();
    }
}
