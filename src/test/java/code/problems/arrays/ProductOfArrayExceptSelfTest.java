package code.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    @DisplayName("create products of arrays except self")
    void checkTheProducts(){
        assertAll(()->{
            assertEquals(ProductOfArrayExceptSelf.compute(List.of(1,2,3,4)), List.of(24,12,8,6));
            assertEquals(List.of(0,0,9,0,0), ProductOfArrayExceptSelf.compute(List.of(-1,1,0,-3,3)));
        });
    }
}