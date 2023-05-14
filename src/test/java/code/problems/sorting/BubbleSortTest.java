package code.problems.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    List<Integer> nums;
    @BeforeEach()
    void setup(){
        nums = new ArrayList<>(List.of(2,4,1,3,5));
    }

    @Test
    void ascending(){
        BubbleSort.sort(nums);
        assertEquals(List.of(1,2,3,4,5), nums);
    }

    @Test
    void descending(){
        BubbleSort.sort(nums, true);
        assertEquals(List.of(5,4,3,2,1), nums);
    }

}