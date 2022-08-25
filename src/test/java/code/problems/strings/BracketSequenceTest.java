package code.problems.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketSequenceTest {

    @Test
    @DisplayName("TestCases")
    void cases(){

        assertAll(() -> {
            assertTrue(BracketSequence.function("()"));
            assertTrue(BracketSequence.function("arb"));
            assertTrue(BracketSequence.function(""));
            assertTrue(BracketSequence.function("[code{something(useful)}]"));
            assertTrue(BracketSequence.function("(){}[]"));
            assertFalse(BracketSequence.function("(})"));
            assertFalse(BracketSequence.function("{}("));
            assertFalse(BracketSequence.function("{}}"));
            assertFalse(BracketSequence.function(")arb("));
            assertFalse(BracketSequence.function("(arb}"));
        });

    }

}