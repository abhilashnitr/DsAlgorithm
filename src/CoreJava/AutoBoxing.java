package CoreJava;

import java.util.ArrayList;
import java.util.List;

class Conversion
{

    // 1.overloaded method with primitive formal argument
    public void method(Long i)
    {

        System.out.println("Reference type Long formal argument :" + i);
    }

    // overloaded method with reference formal argument
    public void method(Integer i)
    {

        System.out.println("Reference type Integer formal argument :" + i);
    }

    // 2. overloaded method primitive formal argument
    // and to be invoked for wrapper Object as overloaded method
    // with wrapper object of same(Long) type as an argument is not
    // available.
    public void method(long i)
    {

        System.out.println("Primitive type long formal argument :" + i);
    }
}

class Rank{
    int i;
    Rank(int i){
        this.i=i;
    }
}

class AutoBoxing
{


    public static void main (String[] args)
    {
     Rank r1=new Rank(5);
     Rank r2=new Rank(3);
     List<Rank> list=new ArrayList<>();
    list.add(r1);
    System.out.println(list.get(0));
    r1=null;
        System.out.println(list.get(0));



    }
}