package code.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    @DisplayName("find the indices of two numbers that equal target")
    void findIndices(){
        assertAll(()->{
            assertArrayEquals(TwoSum.find(new int[] {2,7,11,15}, 9), new int[] {0,1});
            assertArrayEquals(TwoSum.find(new int[] {3,2,4}, 6), new int[] {1,2});
            assertArrayEquals(TwoSum.find(new int[] {0,3,3}, 6), new int[] {1,2});
        });
    }
}