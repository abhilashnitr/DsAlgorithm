package Multithreading;

public class SelfEvenOddThreads {
    public static void main(String[] args) throws InterruptedException{
        PrintEvenOdd  p=new PrintEvenOdd(10);

        Thread t1=new Thread(()->{
            p.printOdd();
        });
        Thread t2=new Thread(()->{
            p.printEven();
        });

        t1.setName("Odd Thread");
        t2.setName("Even Thread");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
class PrintEvenOdd{

    Boolean odd=true;
    int count=1;
    final int index;
    PrintEvenOdd(int index){
        this.index=index;
    }

    void printOdd() {
        synchronized (this) {
            while (count < index) {
                while(!odd){
                    try{
                    wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" - "+count);
                count++;
                odd=false;
                notify();
            }
        }
    }

    void printEven() {
        synchronized (this) {
            while (count < index) {
            while(odd){
                try{
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+" - "+count);
            count++;
            odd=true;
            notify();
            }
        }
    }
}