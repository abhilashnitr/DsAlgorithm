package Sorting;

public class HeapSort {


    public static void main(String[] args) {
        int[] arr={10,5,2,4,8,7,9,1,3};
        heapSort(arr);
       // buildheap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void buildheap(int[] arr){
        for(int i=arr.length/2-1;i>=0;i--){
            heapify(arr,i,arr.length);
        }
    }

    private static void heapify(int[] arr,int i,int N){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<N && arr[left]>arr[largest])
            largest=left;
        if(right<N && arr[right]>arr[largest])
            largest=right;
        if(largest!=i)
        {
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr,largest,N);
        }


    }

    private static void heapSort(int[] arr) {
        buildheap(arr);

        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            heapify(arr,0,i);
        }

    }
}
