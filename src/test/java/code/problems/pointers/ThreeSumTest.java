package code.problems.pointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    @DisplayName("find the triplets that equal to 0")
    void test(){
        assertAll(()->{
            assertEquals(List.of(
                            List.of(-1,-1,2),
                            List.of(-1,0,1)
                    ),
                    ThreeSum.find(new ArrayList<>(List.of(-1,0,1,2,-1,-4))));
            assertEquals(List.of(
                            List.of(-1,0,1),
                            List.of(0,0,0)
                    ),
                    ThreeSum.find(new ArrayList<>(List.of(1,0,0,0,-1))));
            assertEquals(new ArrayList<>(),
                    ThreeSum.find(new ArrayList<>(List.of(0,1,1))));
        });
    }
}