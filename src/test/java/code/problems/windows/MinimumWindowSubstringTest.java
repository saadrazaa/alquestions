package code.problems.windows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    @Test
    @DisplayName("find the minimum possible length substring")
    void test() {
        assertAll(()->{
            assertEquals("BANC", MinimumWindowSubstring.find("ADOBECODEBANC", "ABC"));
            assertEquals("a", MinimumWindowSubstring.find("a", "a"));
            assertEquals("", MinimumWindowSubstring.find("a", "aa"));
        });
    }
}