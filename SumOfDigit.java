public class SumOfDigit {
    public static void main(String[] args) {
        int num = 27121999;
        String results[] = { "", "Leader Quality", "Emotional ", "Practical", "Angry", "Happy", "Money Or", "Follow",
                "Free", "Strong" };

        // 1 + 2 + 3 + 4
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                int singleDigit = num % 10;
                sum = sum + singleDigit;
                num = num / 10;
            }
            num = sum;

        }
        System.out.println(num);
        System.out.println(results[num]);
    }
}
