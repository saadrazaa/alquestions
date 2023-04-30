package code.problems.pointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    @DisplayName("Find the heights with maximum water possible")
    void test(){
        assertAll(()->{
            assertEquals(49, ContainerWithMostWater.findMaxArea(List.of(1,8,6,2,5,4,8,3,7)));
            assertEquals(1, ContainerWithMostWater.findMaxArea(List.of(1,1)));
        });
    }
}