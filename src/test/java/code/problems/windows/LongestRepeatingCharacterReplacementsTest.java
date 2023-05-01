package code.problems.windows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementsTest {

    @Test
    @DisplayName("find the length of a longest repeating character replacement string")
    void test() {
        assertAll(()->{
            assertEquals(4, LongestRepeatingCharacterReplacements.find("ABAB", 2));
            assertEquals(7, LongestRepeatingCharacterReplacements.find("AABABBA", 3));
            assertEquals(4, LongestRepeatingCharacterReplacements.find("ABCDEFG", 3));
        });
    }
}