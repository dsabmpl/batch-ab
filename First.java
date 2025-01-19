
/*
 * Java - OOPS
 * class and object
 * Every Java Program start with class
 * What is class?
 * Class - Blue Print / Plan / Template
 * class - keyword - to define a class
 * ClassName should in Pascal Case
 * AmitSrivastava
 * class name and file name should be same
 */
// class <classname>
class Second {
    /*
     * main () - main is a function
     * entry point for every java program
     * void - keyword - nothing to return
     * static - keyword - when class is loaded then the static will be loaded along
     * public - keyword - access inside/outside the package (folder)
     * String args[] - Command Line arguments
     * Build your commands with your arguments
     * String - predefine class , collection of chars
     * args - parameter name
     * [] = array
     * ... - var args
     */
    static public void main(String... a) {
        int c_d;
        int c$d;
        // camelCase
        double y;
        var t = 90.55; // Java 10

        // Constant (ALL CAPS)
        final int MAX = 100;
        // MAX = 200;

        // Implicit Types / Type Inference
        var x = 10;
        // Explicit Types
        int q = 20;

        /*
         * println - function - used to print in a new line
         * out - predefine object
         * System - predefine class
         * // and this class define the out , in and err objects
         * out is an object of PrintStream class
         */
        System.out.println("Hello Java");
    }
}