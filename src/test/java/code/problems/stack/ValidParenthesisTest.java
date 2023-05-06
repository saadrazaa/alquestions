package code.problems.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    @Test
    @DisplayName("find if the order of brackets in the string is valid")
    void test(){
        assertAll(()->{
            assertTrue(ValidParenthesis.isValid("()"));
            assertTrue(ValidParenthesis.isValid("(){}[]"));
            assertFalse(ValidParenthesis.isValid("(]"));
            assertFalse(ValidParenthesis.isValid("((("));
            assertFalse(ValidParenthesis.isValid("}}"));
            assertFalse(ValidParenthesis.isValid("["));
        });
    }
}