package code.problems.heaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianFromDataStreamTest {

    @Test
    void test(){
        FindMedianFromDataStream medianFinder = new FindMedianFromDataStream();

        medianFinder.addNum(1);
        medianFinder.addNum(2);
        assertEquals(1.5, medianFinder.getMedian());
        medianFinder.addNum(3);
        assertEquals(2.0, medianFinder.getMedian());
    }

}