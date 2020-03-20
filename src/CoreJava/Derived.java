package CoreJava;

class Derived extends Base {
    String a="derived";

    Derived(){
        print();
    }
    private void display() {
        System.out.println("Static or class method from Derived");
    }

    private   void print() {
        System.out.println("Non-static or instance method from Derived");
    }
}