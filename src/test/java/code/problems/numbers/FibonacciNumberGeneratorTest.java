package code.problems.numbers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberGeneratorTest {

    @Test
    @DisplayName("Get a single Fib number back")
    void getFibNum() {
        assertAll(() -> {
            assertEquals(FibonacciNumberGenerator.getFibNum(0L), 0L);
            assertEquals(FibonacciNumberGenerator.getFibNum(1L), 1L);
            assertEquals(FibonacciNumberGenerator.getFibNum(5L), 5L);
            assertEquals(FibonacciNumberGenerator.getFibNum(6L), 8L);
            assertThrows(IllegalArgumentException.class, () -> FibonacciNumberGenerator.getFibNum(-1L));
        });
    }

    @Test
    @DisplayName("Get a sequence of Fib numbers")
    void getSequence() {
        assertAll(() -> {
            assertEquals(FibonacciNumberGenerator.getSequence(0L), List.of(0L));
            assertEquals(FibonacciNumberGenerator.getSequence(1L), List.of(0L,1L));
            assertEquals(FibonacciNumberGenerator.getSequence(5L), List.of(0L,1L, 1L, 2L, 3L, 5L));
            assertEquals(FibonacciNumberGenerator.getSequence(6L), List.of(0L,1L, 1L, 2L, 3L, 5L, 8L));
            assertThrows(IllegalArgumentException.class, () -> FibonacciNumberGenerator.getFibNum(-1L));
        });
    }
}