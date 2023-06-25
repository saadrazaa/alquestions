package code.problems.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Problem:
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.

For example, for arr = [2,3,4], the median is 3.
For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
Implement the MedianFinder class:

MedianFinder() initializes the MedianFinder object.
void addNum(int num) adds the integer num from the data stream to the data structure.
double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.

Constraints:
-105 <= num <= 105
There will be at least one element in the data structure before calling findMedian.
At most 5 * 104 calls will be made to addNum and findMedian.
 */
public class FindMedianFromDataStream {
    Queue<Integer> small;
    Queue<Integer> large;

    public FindMedianFromDataStream(){
        small = new PriorityQueue<>(Comparator.reverseOrder());
        large = new PriorityQueue<>();
    }

    public void addNum(int num){
        if(!large.isEmpty() && num > large.peek()){
            large.add(num);
        }else{
            small.add(num);
        }
        balanceHeaps();
    }

    public double getMedian(){
        if(small.size() > large.size()){
            return small.peek();
        }
        if(large.size() > small.size()){
            return large.peek();
        }
        return (double) (large.peek() + small.peek()) / 2;
    }

    private void balanceHeaps(){
        if(small.size() > large.size() + 1){
            int val = small.remove();
            large.add(val);
        }

        if(large.size() > small.size() + 1){
            int val = large.remove();
            small.add(val);
        }
    }
}
