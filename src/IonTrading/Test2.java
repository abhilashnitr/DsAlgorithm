package IonTrading;

public class Test2 {

    public static void main(String[] args){
        A obj = new C();
    long a=10;
        obj.method1();
        obj.method1(a);

    }
}

class A{

    void method1(){
        System.out.println(" a no para");
    }
    void method1(long a){
        System.out.println(" a int para");
    }
}
class C extends A
{
//    void method1(){
//        System.out.println(" c no para");
//    }
//    void method1(long a){
//       System.out.println(" c long para");
//    }
}
