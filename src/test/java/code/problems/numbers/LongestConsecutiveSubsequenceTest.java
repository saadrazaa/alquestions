package code.problems.numbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSubsequenceTest {



    @Test
    @DisplayName("TestCases")
    void cases(){

        assertAll(() -> {
            assertEquals(LongestConsecutiveSubsequence.function(new int[] {5}), 1);
            assertEquals(LongestConsecutiveSubsequence.function(new int[] {5,5}), 1);
            assertEquals(LongestConsecutiveSubsequence.function(new int[] {1,3}), 1);
            assertEquals(LongestConsecutiveSubsequence.function(new int[] {4,6,7,8}), 3);
            assertEquals(LongestConsecutiveSubsequence.function(new int[] {3,4,9,2,7,5,6}), 6);
            assertEquals(LongestConsecutiveSubsequence.function(new int[] {2,3,4,10,11,12,13,14}), 5);
            assertThrows(Exception.class, () -> LongestConsecutiveSubsequence.function(new int[] {}));
        });
    }

}