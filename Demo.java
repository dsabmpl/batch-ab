public strictfp class Demo {
    // Scope
    int x; // Instance Variable
    // main overload

    public static void main() {
        System.out.println("This is my main fn");
    }

    // can we have more than one main in a single java class
    public static strictfp void main(String[] args) {
        boolean att = true; // 1 byte / 2 byte (OS)
        char e = 'A'; // 2 byte (UNICODE)
        e = 'न';
        System.out.println(e);
        byte age = 20; // byte literal
        byte y = (byte) 130;
        long timeInMs = 10000000l; // long literal
        float t = 10.20f; // float literal
        double tt = 10.20;
        System.out.println(y);
        int myBalance;
        System.out.println("hello java");
        // main();
        // variable declare
        // int x = 10; // Explicit type
        // var y = 20; // Type Inference (Implicit Type)
        int a = 10;
        a = a + 10;
        System.out.println(a + 10);
        System.out.println(a);

    }
}
