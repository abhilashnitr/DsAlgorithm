package Multithreading;
import com.sun.jdi.Value;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class DemoHashMap extends  Thread{


    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            String s1="s"+i+Thread.currentThread().getName();
            HashMapSynchronizationDemo.process(s1,Thread.currentThread().getName());
        }
    }
}
public class HashMapSynchronizationDemo extends Thread {
    private static Map<String, String> currencies = new HashMap<String, String>();
    static {
        currencies.put("USA", "USD");
        currencies.put("England", "GBP");

    }

    public static void process(String s1,String s2){

        synchronized (currencies){
            System.out.println(Thread.currentThread().getName());
            currencies.put(s1,s2);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        currencies = Collections.synchronizedMap(currencies);

        DemoHashMap d1=new DemoHashMap();
        DemoHashMap d2=new DemoHashMap();

        d1.start();
        d2.start();

        d1.join();
        d2.join();

        //currencies.forEach((key, value)-> System.out.println(key+"  "+value));

    }

}



