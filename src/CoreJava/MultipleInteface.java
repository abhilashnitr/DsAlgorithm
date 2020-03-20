package CoreJava;

public class MultipleInteface implements A {


    public void fun(){

    }

    public static void main(String[] args){
        System.out.println(A.x);


    }
}

interface A{
    int x=10;
    public void fun();
}



