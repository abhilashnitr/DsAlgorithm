package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumertry {

    public static void main(String[] args) {

        Buffer b=new Buffer(2);

        Thread t1=new Thread(()->{
            try {
                b.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread t2=new Thread(()->{
            try {
                b.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.setName("Producer");
        t2.setName("Consumer");
        t1.start();
        t2.start();

    }

    static class Buffer{
        Queue<Integer> list;
        int size;
        Buffer(int size){
            this.size=size;
            this.list=new LinkedList<>();
        }
        void consume() throws InterruptedException {
            while(true){
                synchronized (this){
                    while(list.size()==0){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int val=list.poll();
                    System.out.println(Thread.currentThread().getName()+" "+val);
                    Thread.sleep(1000);
                    notify();
                }
            }
        }

        void produce() throws InterruptedException {
            int value=0;
            while(true){
                synchronized (this){
                    while(list.size()==size){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    list.add(value);
                    System.out.println(Thread.currentThread().getName()+" "+value);
                    value++;
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}
