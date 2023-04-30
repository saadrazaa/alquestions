package code.problems.pointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    @DisplayName("check if a string is a palindrome")
    void test(){
        assertAll(() -> {
            assertEquals(true, ValidPalindrome.check("A man,         a plan, a canal: Panama"));
            assertEquals(false, ValidPalindrome.check("race a car"));
            assertEquals(true, ValidPalindrome.check(" "));
        });
    }
}