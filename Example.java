/*
    Local Var 
    Global Var - Global is evil
    int customerid;
    void payment(){
   
    }
 * void order(){
 * 
 * orderid
 * }
 * void login(){
 * 
 * }
 */
// Data Binding
// class Order{
//     int id;
//     void add(){

//     }
//     boolean update(){

//     }
// }
// Class name = Noun 
// SRP
class Customer {
    // Members - Instance Variables
    // When u create instance/object, than it comes in Memory
    // Lazy
    // during runtime when memory allocate it init with default value
    private int id;
    private String name;
    private double balance;
    private String email;

    // Every class has by default a default constructor (No Args)
    /*
     * Constructor name and class name is same
     * Constructor not return anything , even void
     * Constructor is use to init instance variables
     */
    {
        System.out.println("Init Block " + id + " " + name);
    }

    Customer() {

        balance = 100;
        System.out.println("I am the default ");
    }

    void validate(int id, String name, double balance, String email) {
        if (id <= 0) {
            System.out.println("Invalid Id ");
            System.exit(0);
        }
        if (name.length() == 0) {
            System.out.println("Name is Empty ");
            System.exit(0);
        }
        if (balance <= 0) {
            System.out.println("Invalid Balance ");
            System.exit(0);
        }
        if (email.length() == 0 || !email.contains("@")) {
            System.out.println("Invalid Email");
            System.exit(0);
        }
    }

    Customer(int id, String name, String email) {

        // validate(id, name, balance, email);
        // Instance Var = Local var
        this();
        this.id = id;
        this.name = name;

        this.email = email;

    }

    // takeInput - Local Variables (Stack)
    // public void takeInput(int id, String name, double balance, String email) {
    // validate(id, name, balance, email);
    // // Instance Var = Local var
    // this.id = id;
    // this.name = name;
    // this.balance = balance;
    // this.email = email;

    // }

    // verb
    void print() {
        // this - keyword
        // it contains the current calling object reference
        System.out.println(this.id);
        System.out.println(name);
        System.out.println(balance);
        System.out.println(email);
    }

}

class Example {
    public static void main(String[] args) {
        // Customer is also a data type (Custom Data Type) / Complex Data Type
        Customer amit; // amit - variable e.g DataType varName
        // amit = new Customer();
        amit = new Customer(1001, "Amit", "amit@yahoo.com");
        // amit.takeInput(1001, "Amit", 900, "abcd@dd.com");
        // amit.id = -1001;
        amit.print();
        int x; // Local Variable (Stack)
        x = 10;
        // System.out.println(x);
    }
}
