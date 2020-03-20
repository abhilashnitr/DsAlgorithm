package ArrayUtils;

public class maxSumNonAdj {

    public static void main(String[] args) {
        int arr[] = new int[]{6, 7, 1, 3, 8, 2, 4};
        System.out.println(FindMaxSum(arr, arr.length));
    }
   static int FindMaxSum(int arr[], int n)
    {
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;

        for (i = 1; i < n; i++)
        {
            /* current max excluding i */
            excl_new = (incl > excl) ? incl : excl;

            /* current max including i */
            incl = excl + arr[i];
            excl = excl_new;
        }

        /* return max of incl and excl */
        return ((incl > excl) ? incl : excl);
    }
}
