package code.problems.binarySearch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {

    @Test
    @DisplayName("find the minimums in roated sorted arrays")
    void test(){
        assertAll(()->{
            assertEquals(1, FindMinimumInRotatedSortedArray.find(List.of(3,4,5,1,2)));
            assertEquals(0, FindMinimumInRotatedSortedArray.find(List.of(4,5,6,7,0,1,2)));
            assertEquals(11, FindMinimumInRotatedSortedArray.find(List.of(11,13,15,17)));
            assertEquals(0, FindMinimumInRotatedSortedArray.find(List.of(0)));
        });
    }
}