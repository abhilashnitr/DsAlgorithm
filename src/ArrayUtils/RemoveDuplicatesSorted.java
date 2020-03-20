package ArrayUtils;

public class RemoveDuplicatesSorted {


    public static void main(String[] args) {
        int[] x={1,1,1,2,3,3,4,4,5,5,6,6,7,8,8,8,8};
        int y=removeDup(x);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }

    private static int removeDup(int[] x) {
        int n=x.length-1;
        int i=0;
        int j=0;
        while (i<n){
            if(x[i]!=x[i+1]){
                x[j]=x[i];
                j++;
            }
            i++;
        }
        x[j]=x[i];
        return j;
    }
}
