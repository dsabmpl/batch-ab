public class PrintName2 {

    static void printName(int num) {
        if (num == 0) {
            return;
        }
        System.out.println("Amit " + num); // During Stack Build
        printName(num - 1); // num -1 small problem
        System.out.println("Srivastava " + num); // During Stack Fall
    }

    public static void main(String[] args) {
        printName(5);
    }
}
