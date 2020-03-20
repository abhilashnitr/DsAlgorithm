package Practise;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public void foo(Object o) {
        System.out.println("Object");
    }

//    public void foo(String s) {
//        System.out.println("String");
//    }
    public void foo(Exception e) {
        System.out.println("Exception");
    }

    public void foo(NullPointerException ne) {
        System.out.println("NullPointerException");
    }

    public static void main(String[] args) {
        //new Test().foo(null);

        List<String> list=new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("ab");
        list.add("cb");
        list.add("cd");
        list.add("fg");
        list.add("ed");
        System.out.println("First Iteration");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("Size"+list.size());
//        for(int i=0;i<list.size();i++){
//            list.remove(i);
//        }
        list.remove("abc");
        list.remove("abc");
        System.out.println("Second Iteration");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("Size"+list.size());
//        for(int i=0;i<list.size();i++){
//            list.remove(i);
//        }
//        System.out.println("Third Iteration");
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println("Size"+list.size());
//        for(int i=0;i<list.size();i++){
//            list.remove(i);
//        }
//        System.out.println(list.size());


    }

}
