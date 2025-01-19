import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;

//import java.lang.*;
public class Demo2 {
    public static void main(String[] args) {
        // Reference
        String name = "ljkldfjhkhgjkdlhgjhdkfjgkjdfhgjkdfjkhdfjkghjkfhjkfhjkhgkjhfjkghjkfhgjkhfdkjgdhk";
        int x = 10;
        String name2 = name;
        // India + China
        BigInteger b = new BigInteger("654766575676578486776787676878");
        BigInteger b2 = new BigInteger("6456453453445868678678768687342");
        BigInteger b3 = b.add(b2);
        System.out.println(b3);
        BigDecimal bb = new BigDecimal("54534534534543543543.222253");

        String n = "Amit";
        System.out.println(n.length());
        System.out.println(n.toUpperCase());
        System.out.println(n.trim());

        // Wrapper Types
        int d = 10; // value
        Integer d2 = 100; // data + methods
        System.out.println(d2.byteValue());

        Float r = 100.20f;
        Long r2 = 100L;
        Boolean ff = true;
        Character cc = 'A';
        System.out.println(Character.isAlphabetic(cc));

        LinkedList<Integer> l = new LinkedList<>();

        // Reference Type
        // Array
        int arr[] = { 10, 20, 30, 40, 50 };

    }
}
