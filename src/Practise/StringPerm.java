package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringPerm {
    static void permutationUtil(int[] count,char [] ch,char[] result,int level,List<String> resultList){

        if(level==result.length)
        {
            resultList.add(new String(result));
            return;
        }
        for(int i=0;i<ch.length;i++){
            if(count[i]==0)
                continue;
            result[level] = ch[i];
            count[i]--;
            permutationUtil(count,ch, result, level + 1, resultList);
            count[i]++;
        }
    }

    static void permutation(String str){

        Map<Character,Integer> countMap=new TreeMap<>();

        for(int i=0;i<str.length();i++)
        {
            if(countMap.containsKey(str.charAt(i)))
            {
                int val=countMap.get(str.charAt(i));
                countMap.put(str.charAt(i),val+1);
            }
            else
                countMap.put(str.charAt(i),1);
        }

        char[] ch=new char[countMap.size()];

        int[] count=new int[countMap.size()];

        int index=0;

        for(Map.Entry<Character,Integer> entry:countMap.entrySet())
        {
            ch[index]=entry.getKey();
            count[index]=entry.getValue();
            index++;
        }
        char[] result=new char[str.length()];
        List<String> resultList = new ArrayList<>();
        permutationUtil(count,ch,result,0,resultList);
        System.out.println(resultList);
    }
    public static void main(String[] args){
        String str="abd";

        permutation(str);
        System.out.println();
    }
}
