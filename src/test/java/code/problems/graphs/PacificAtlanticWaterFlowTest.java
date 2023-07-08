package code.problems.graphs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PacificAtlanticWaterFlowTest {

    @Test
    void test(){
        List<List<Integer>> heights1 = Arrays.asList(
                Arrays.asList(1,2,2,3,5),
                Arrays.asList(3,2,3,4,4),
                Arrays.asList(2,4,5,3,1),
                Arrays.asList(6,7,1,4,5),
                Arrays.asList(5,1,1,2,4)
        );

        List<List<Integer>> heights2 = Arrays.asList(
                Arrays.asList(1)
        );

        assertAll(()->{
            assertEquals(Set.copyOf(List.of(
                    List.of(0,4),
                    List.of(1,3),
                    List.of(1,4),
                    List.of(2,2),
                    List.of(3,0),
                    List.of(3,1),
                    List.of(4,0)
            )), Set.copyOf(PacificAtlanticWaterFlow.calculate(heights1)));
            assertEquals(Set.copyOf(List.of(
                    List.of(0,1)
            )), Set.copyOf(PacificAtlanticWaterFlow.calculate(heights2)));
        });
    }
}