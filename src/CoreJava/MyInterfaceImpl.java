package CoreJava;

public class MyInterfaceImpl implements MyInterface {

    public void sayHello() {
        System.out.println(MyInterface.hello);
    }
}

interface MyInterface {

   public String hello = "Hello";

   public void sayHello();
}