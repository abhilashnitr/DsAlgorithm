package Multithreading;

public class StartThread {

    public static void main(String[] args) {
        ExtThreadLambda t= new ExtThreadLambda();

        Thread t1=new Thread(()->{
                t.print();
        });

        t1.start();
    }

}

class ExtThreadLambda{
    void print(){
        System.out.println("HI");
    }
}
