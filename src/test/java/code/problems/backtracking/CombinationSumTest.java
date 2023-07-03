package code.problems.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    @Test
    void test(){
        assertAll(()->{
            assertEquals(List.of(List.of(2,2,3), List.of(7)), CombinationSum.find(
                    List.of(2,3,6,7), 7
            ));
            assertEquals(List.of(List.of(2,2,2,2), List.of(2,3,3), List.of(3,5)), CombinationSum.find(
                    List.of(2,3,5), 8
            ));
            assertEquals(List.of(), CombinationSum.find(
                    List.of(2), 1
            ));
        });
    }

}