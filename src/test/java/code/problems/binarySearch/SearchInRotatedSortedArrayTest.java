package code.problems.binarySearch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    @Test
    @DisplayName("search for index of element in rotated sorted array")
    void test(){
        assertAll(()->{
            assertEquals(4, SearchInRotatedSortedArray.search(List.of(4,5,6,7,0,1,2), 0));
            assertEquals(-1, SearchInRotatedSortedArray.search(List.of(4,5,6,7,0,1,2), 9));
            assertEquals(3, SearchInRotatedSortedArray.search(List.of(4,5,6,7), 7));
            assertEquals(0, SearchInRotatedSortedArray.search(List.of(4), 4));
        });
    }
}