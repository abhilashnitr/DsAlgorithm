package CoreJava;

public class Base {
    String a="base";
    Base(){
        print();
    }
    private  void display() {
    System.out.println("Static or class method from Base");
}
    private void print() {
        System.out.println("Non-static or instance method from Base");
    }
}
