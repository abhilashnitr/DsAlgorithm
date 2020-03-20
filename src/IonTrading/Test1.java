package IonTrading;

import java.io.IOException;

public class Test1 {

    public static int add(int a, int b)
    {
        System.out.println("Hello");
        try{
            System.out.println("Hello");
            throw new IOException("Operation not permitted");

        }finally{
            System.out.println("Hello");
            return 5;
        }

    }

    public static void main(String[] args) {

        System.out.println(add(5,6));
        //add(2,3);

    }
}
