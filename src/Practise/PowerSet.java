package Practise;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static void PowerSetUtil(List<ArrayList<Integer>> results,ArrayList<Integer> subset,int startIndex,int[] nums){
        results.add(new ArrayList<>(subset));
        System.out.println(subset);
        if(startIndex==nums.length)
            return;
        for(int i=startIndex;i<nums.length;i++){
            subset.add(nums[i]);
            PowerSetUtil(results,subset,i+1,nums);
            subset.remove(subset.size()-1);
        }
    }

    public static void power(int[] nums){
        List<ArrayList<Integer>> results=new ArrayList<>();
        ArrayList<Integer> subset=new ArrayList<>();
        PowerSetUtil(results,subset,0,nums);
        System.out.println(results);
    }

    public static void count(Employee e){
        e.i=10;
    }

    public static void count(Integer i){
        i++;

    }
    public static void count(String s){
        s=s+"abc";

    }

    public static void main(String[] args){
        int[] nums={1,2,3};
      //  Integer i=new Integer(0);
        //String str=new String("abc");
        //Employee e=new Employee();
        //e.i=5;
        //e.j=7;
        //count(e);
        //System.out.println(str);
       power(nums);

    }
}

class Employee{
    int i;
    int j;
}
