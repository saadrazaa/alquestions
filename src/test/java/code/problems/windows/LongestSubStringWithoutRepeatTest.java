package code.problems.windows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringWithoutRepeatTest {

    @Test
    @DisplayName("find the length of the longest substring without repeating characters")
    void test(){
        assertAll(()->{
            assertEquals(3, LongestSubStringWithoutRepeat.find("abcabcbb"));
            assertEquals(1, LongestSubStringWithoutRepeat.find("bbbbb"));
            assertEquals(3, LongestSubStringWithoutRepeat.find("pwwkew"));
        });
    }
}