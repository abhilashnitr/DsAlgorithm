package Practise;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void CombinationUtil(List<ArrayList<Integer>> results,ArrayList<Integer> subset,int[] nums,int total,int startIndex){

        if(total==0){
            results.add(new ArrayList<>(subset));
            return;
        }
        for(int i=startIndex;i<nums.length;i++){
            if(nums[i]>total)
                break;
            subset.add(nums[i]);
            CombinationUtil(results,subset,nums,total-nums[i],i+1);
            subset.remove(subset.size()-1);
        }
    }

    public static void main(String[] args){
        int[] nums={1,2,2,3,4};
        int total=5;
        List<ArrayList<Integer>> results=new ArrayList<>();
        ArrayList<Integer> subset=new ArrayList<>();

        CombinationUtil(results,subset,nums,total,0);
        System.out.println(results);
    }
}
