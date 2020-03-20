import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
    //    int[] a={3,5,6,3,3,5};
        String s="BALLOONMONBALLOONABCHDHKK";
        int x=solution(s);
        System.out.println(x);
    }

    static int solution(String S) {
      /*  HashMap<Integer,Integer> map=new HashMap<>();
        // write your code in Java SE 8
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                int y=map.get(A[i]);
                map.put(A[i],y++);
            }else {
                map.put(A[i],1);
            }
        }
        int pairs=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                int x=entry.getValue();
                pairs=((x+1)*x)/2-(x+1);
            }
        }*/
        int[] count=new int[26];
        for(int i=0;i<S.length();i++){
            int x=S.charAt(i)-'A';
            count[x]+=1;
        }
        //Size L
        count['L'-'A']=count['L'-'A']/2;
        count['O'-'A']=count['O'-'A']/2;
        //get min from B,A,L,O,N
        int pair=count['A'-'A'];
        pair=Math.min(pair,count['B'-'A']);
        pair=Math.min(pair,count['L'-'A']);
        pair=Math.min(pair,count['O'-'A']);
        pair=Math.min(pair,count['N'-'A']);

        return pair;

    }
}
