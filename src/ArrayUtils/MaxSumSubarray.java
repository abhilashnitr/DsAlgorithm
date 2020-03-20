package ArrayUtils;

public class MaxSumSubarray {
    public static int getmax(int[] x){
        int maxSum=0;
        int CurSum=0;
        for(int i=0;i<x.length;i++){
            CurSum=Math.max(x[i]+CurSum,x[i]);
            if(maxSum<CurSum)
                maxSum=CurSum;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,-5,9,8,-90,15};
        System.out.println(getmax(arr));
    }
}
