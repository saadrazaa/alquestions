package code.problems.numbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoEqualsTargetTest {

    @Test
    @DisplayName("Test cases")
    void find() {
        assertAll(() -> {
            assertArrayEquals(SumOfTwoEqualsTarget.find(new long[]{}, 50), new long[]{});
            assertArrayEquals(SumOfTwoEqualsTarget.find(new long[]{1,2,3}, 9), new long[]{});
            assertArrayEquals(SumOfTwoEqualsTarget.find(new long[]{1,2,3}, 5), new long[]{1,2});
            assertArrayEquals(SumOfTwoEqualsTarget.find(new long[]{0,4,8,-5,-6,0}, 0), new long[]{0,5});
            assertArrayEquals(SumOfTwoEqualsTarget.find(new long[]{0,4,8,-5,-6,0}, -1), new long[]{1,3});
        });
    }
}