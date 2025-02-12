public class Table {

    // Approach - 2
    static String printTable2(int num, int count) {
        if (count == 0) {
            return "";
        }
        return printTable2(num, count - 1) + num + "*" + count + "=" + (num * count) + "\n";
        // String old = printTable2(num, count - 1);
        // String newExp = num + "*" + count + "=" + (num * count) + "\n";
        // return old + newExp;
    }

    // Approach - 1
    static void printTable(int num, int count) {
        if (count == 0) {
            return;
        }
        printTable(num, count - 1);
        // Stack Fall
        System.out.println(num + "*" + count + "=" + (num * count));
    }

    public static void main(String[] args) {
        // printTable(5, 3);
        System.out.println(printTable2(5, 10));
    }
}
