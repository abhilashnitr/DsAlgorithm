package HeapUtils;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianofStream {

    public static void main(String[] args) {
        MedianFinder mf=new MedianFinder();
        mf.addNum(10);
        System.out.println(mf.findMedian());
        mf.addNum(12);
        System.out.println(mf.findMedian());
        mf.addNum(3);
        System.out.println(mf.findMedian());
        mf.addNum(15);
        System.out.println(mf.findMedian());
        mf.addNum(2);
        System.out.println(mf.findMedian());

    }
}

class MedianFinder {
    PriorityQueue<Integer> minHeap = null;
    PriorityQueue<Integer> maxHeap = null;

    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        minHeap.offer(num);
        maxHeap.offer(minHeap.poll());

        if(minHeap.size()<maxHeap.size()){
            minHeap.offer(maxHeap.poll());
        }
    }

    public double findMedian() {
        if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        }else {
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
    }
}
