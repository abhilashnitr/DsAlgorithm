package ArrayUtils;

public class FIndMagicIndex {
    public static void main(String[] args) {
        int[] x={1,3,50,10,9,5,1};
        int max=findMagicIndex(x,0,6);
    }

    private static int findMagicIndex(int[] A, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (mid == A[mid]) // check for magic index.
                return mid;
            if (mid > A[mid]) { // If mid>A[mid] means fixed point might be on
                // the right half of the array
                return findMagicIndex(A, mid + 1, end);
            } else {// If mid<A[mid] means fixed point might be on
                // the left half of the array
                return findMagicIndex(A, start, mid - 1);
            }
        }
        return -1;
    }
}
