package CoreJava;

public class Throws_Example1 {

    static void fun()throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        //throw new IllegalAccessException("demo");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            e.printStackTrace();
            System.out.println("caught in main.");
        }
    }
}
