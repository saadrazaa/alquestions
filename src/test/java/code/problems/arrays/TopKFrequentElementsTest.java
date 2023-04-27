package code.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    @DisplayName("get the top K frequent elements in the given number arrays")
    void findKFrequent(){
        assertAll(()->{
            assertEquals(TopKFrequentElements.find(new int[]{1, 1, 1, 2, 2, 3}, 2), List.of(1,2));
            assertEquals(TopKFrequentElements.find(new int[]{1}, 1), List.of(1));
        });
    }
}