package code.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    @DisplayName("check if the two strings are anagrams")
    void checkAnagrams(){
        assertAll(()-> {
            assertTrue(ValidAnagram.check("anagram", "nagaram"));
            assertFalse(ValidAnagram.check("rat", "car"));
        });
    }

}