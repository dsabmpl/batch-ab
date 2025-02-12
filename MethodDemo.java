class MethodDemo {
    // Instance Method
    void disp() {
        System.out.println("I am Instance Method");
    }

    // Non Instance or Class Method
    static void show() {
        System.out.println("I am static Method");
    }

    public static void main(String[] args) {
        show();
        // MethodDemo obj = new MethodDemo();
        // obj.disp();
        // // classname.staticMethod()
        // // MethodDemo.show();
        // show();
    }
}