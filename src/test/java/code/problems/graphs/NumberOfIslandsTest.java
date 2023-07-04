package code.problems.graphs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    @Test
    void test(){
        List<List<Character>> grid1 = List.of(
                List.of('1', '1', '1', '1', '0'),
                List.of('1', '1', '0', '1', '0'),
                List.of('1', '1', '0', '0', '0'),
                List.of('0', '0', '0', '0', '0')
        );
        List<List<Character>> grid2 = List.of(
                List.of('1', '1', '0', '0', '0'),
                List.of('1', '1', '0', '0', '0'),
                List.of('0', '0', '1', '0', '0'),
                List.of('0', '0', '0', '1', '1')
        );

        assertAll(()->{
            assertEquals(1, NumberOfIslands.find(grid1));
            assertEquals(3, NumberOfIslands.find(grid2));
        });
    }
}