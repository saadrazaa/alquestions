package code.problems.windows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    @DisplayName("find the best days to buy and sell stock, maximizing profit")
    void test(){
        assertAll(()->{
            assertEquals(5, BestTimeToBuyAndSellStock.find(List.of(7,1,5,3,6,4)));
            assertEquals(0, BestTimeToBuyAndSellStock.find(List.of(7,6,4,3,1)));
        });
    }
}