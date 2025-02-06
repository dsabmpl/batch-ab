public class PrintTable {

    static String printTable2(int num, int count) {
        // Base case
        if (count == 0) {
            return "";
        }
        // Small Problem
        String r = printTable2(num, count - 1);
        return r + num + "*" + count + "=" + (num * count) + "\n";
    }

    static void printTable(int num, int count) {
        // Base case
        if (count == 0) {
            return;
        }
        // Small Problem
        printTable(num, count - 1);
        // Stack Fall
        System.out.println(num + "*" + count
                + "=" + (num * count));
    }

    public static void main(String[] args) {
        String r = printTable2(7, 10);
        System.out.println(r);
    }
}
