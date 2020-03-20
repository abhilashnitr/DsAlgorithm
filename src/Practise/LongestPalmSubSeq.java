package Practise;

public class LongestPalmSubSeq {

    public static int recGetLength(String str, int i, int j){
        if(i==j)
            return 1;
        else if(str.charAt(i)==str.charAt(j)&&i+1==j)
            return 2;
        else if(str.charAt(i)==str.charAt(j))
            return 2+recGetLength(str,i+1,j-1);
        else
            return Math.max(recGetLength(str,i+1,j),recGetLength(str,i,j-1));
    }
    public static int dynGetLength(String str){
        int[][] count=new int[str.length()][str.length()];
        for(int i=0;i<str.length();i++)
            count[i][i]=1;
        for(int l=2;l<=str.length();l++){
            for(int i=0;i<str.length()-l+1;i++){
                int j=i+l-1;
                if(l==2&&str.charAt(i)==str.charAt(j))
                    count[i][j]=2;
                else if(str.charAt(i)==str.charAt(j))
                    {
                    count[i][j]=count[i+1][j-1]+2;
                    System.out.println(count[i][j]+" "+i+" "+j);
                     }
                else
                    count[i][j]=Math.max(count[i+1][j],count[i][j-1]);
            }
        }
        return count[0][str.length()-1];
    }
    public static  void main (String_Util[] args){
        String str="acbdba";
        int j=str.length();
        System.out.println(recGetLength(str,0,str.length()-1));
        System.out.println(dynGetLength(str));
    }
}
