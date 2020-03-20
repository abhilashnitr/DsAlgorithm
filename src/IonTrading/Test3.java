package IonTrading;

import java.util.HashMap;

class Emp1{
     public int hashCode(){
         return 2;
    }
    public boolean equals(Object obj){
         return true;
    }
}
class Emp2{
    public int hashCode(){
        return 2; }
    public boolean equals(Object obj){
        return false;}}
public class Test3 {
    public static void main(String[] args){
        //HashMap<Emp1,Integer> map1=new HashMap<>();
        HashMap<Emp2,Integer> map2=new HashMap<>();
        Emp2 em4=new Emp2();
        Emp2 em5=new Emp2();
        Emp2 em6=new Emp2();
        map2.put(em4,5);
        map2.put(em5,6);
        map2.put(em6,7);
        //System.out.println(" Map 1 "+map1.get(em1)+" "+map1.get(em2)+" "+map1.get(em3));
        System.out.println(" Map 2 "+map2.get(em4)+" "+map2.get(em5)+" "+map2.get(em6));
    }}








/*
    Emp1 em1=new Emp1();
    Emp1 em2=new Emp1();
    Emp1 em3=new Emp1();
    map1.put(em1,5);
    map1.put(em2,6);
    map1.put(em3,0);*/
