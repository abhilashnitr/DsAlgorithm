package Practise;

public class RobotGrid {
    public static int recNumOfPath(int m,int n){
        if(m==1||n==1)
            return 1;
        else
        {
            return recNumOfPath(m-1,n)+recNumOfPath(m,n-1);
        }
    }
    public static int dynNumOfPath(int m,int n){
        int[][] count=new int[m][n];
        for(int i=0;i<m;i++){
            count[i][0]=1;
        }
        for(int j=0;j<n;j++){
            count[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                count[i][j]=count[i-1][j]+count[i][j-1];
            }
        }
        return count[m-1][n-1];
    }

    public static  void main (String_Util[] args){
        int m=6;int n=6;
        System.out.println(recNumOfPath(m,n));
        System.out.println(dynNumOfPath(m,n));

    }
}
