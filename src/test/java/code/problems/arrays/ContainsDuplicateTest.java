package code.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    @DisplayName("check for duplicates in the given arrays")
    void checkDuplicates(){
        assertAll(() -> {
            assertTrue(ContainsDuplicate.check(new int[]{1, 2, 3, 1}));
            assertFalse(ContainsDuplicate.check(new int[]{1, 2, 3,4}));
            assertTrue(ContainsDuplicate.check(new int[]{1,1,1,3,3,4,3,2,4,2}));
        });
    }

}