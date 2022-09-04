package code.problems.numbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    @DisplayName("Test cases")
    void find() {
        assertAll(() -> {
            assertEquals(GreatestCommonDivisor.find(565645634535345L, 53455454525454435L), 15L);
            assertEquals(GreatestCommonDivisor.find(5L, 10L), 5L);
            assertEquals(GreatestCommonDivisor.find(28L, 14L), 14L);
            assertEquals(GreatestCommonDivisor.find(28L, 99L), 1L);
            assertEquals(GreatestCommonDivisor.find(0L, 5L), -1L);
            assertEquals(GreatestCommonDivisor.find(-5L, 5L), -1L);

        });
    }
}