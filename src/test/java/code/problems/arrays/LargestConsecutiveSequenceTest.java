package code.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LargestConsecutiveSequenceTest {

    @Test
    @DisplayName("test the finding of largest consecutive sequences")
    void testLCS(){
        assertAll(()->{
            assertEquals(4, LargestConsecutiveSequence.find(List.of(100, 4, 200, 1, 2, 3)));
            assertEquals(9, LargestConsecutiveSequence.find(List.of(0,3,7,2,5,8,4,6,0,1)));
        });
    }

}