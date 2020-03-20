package Practise;

public class MaxHeap {

    public static void sort(int arr[])
    {
        int n = arr.length;



        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i)
    {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    static void buildHeap(int arr[], int n)
    {
        for (int i = n/2-1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4, 6, 13, 10,
                9, 8, 15, 17 };

        int n = arr.length;

        // Build heap (rearrange array)
        buildHeap(arr,n);
        System.out.println("Build array is");
        printArray(arr);

            sort(arr);
            System.out.println("Sorted array is");
            printArray(arr);
        }
}
