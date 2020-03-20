package Clonable;

// A Java program to demonstrate shallow copy
// using clone()

// An object reference of this class is
// contained by Test2
class Test implements Cloneable
{
    int x, y;

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    protected Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
}

// Contains a reference of Test and implements
// clone with shallow copy.
class Test2 implements Cloneable
{
    int a;
    int b;
    Test c = new Test();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Test getC() {
        return c;
    }

    public void setC(Test c) {
        this.c = c;
    }

    protected Object clone() throws
            CloneNotSupportedException
    {
        Test2 t2= (Test2) super.clone();
        t2.c= (Test) t2.c.clone();

        return t2;
        //return super.clone();
    }

    @Override
    public String toString() {
        return "Test2{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

// Driver class
public class Main
{
    public static void main(String args[]) throws
            CloneNotSupportedException
    {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        Test2 t2 = (Test2)t1.clone();

        // Creating a copy of object t1 and passing
        //  it to t2
        t2.a = 100;

        // Change in primitive type of t2 will not
        // be reflected in t1 field
        t2.c.x = 300;

        // Change in object type field will be
        // reflected in both t2 and t1(shallow copy)
//        System.out.println(t1.a + " " + t1.b + " " +
//                t1.c.x + " " + t1.c.y);
//        System.out.println(t2.a + " " + t2.b + " " +
//                t2.c.x + " " + t2.c.y);

        System.out.println(t1);
        System.out.println(t2);
    }
}