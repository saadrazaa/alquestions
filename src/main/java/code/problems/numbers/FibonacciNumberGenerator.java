package code.problems.numbers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibonacciNumberGenerator {

    /**
     * an internal hash map to store computed Fib numbers while recursion.
     * for dynamic programmed solution
     * stays filled during runtime
     */
    private static final Map<Long, Long> dpMap = new HashMap<>();


    /**
     * @param index the index of wanted fib number in the fib sequence
     * @return a Long type Fib number
     */
    public static Long getFibNum(Long index){

        // if solutions is already computed, return that
        if (dpMap.containsKey(index)){
            return dpMap.get(index);
        }

        // base case for recursion, for 0,1 index args
        if (index <=1){
            Long num = Math.max(0, index);
            dpMap.put(0L, 0L);
            dpMap.put(1L, 1L);
            return num;
        }

        // recurse on previous 2 Fib numbers
        Long num = getFibNum(index - 1) + getFibNum(index - 2);
        dpMap.put(index, num);
        return num;
    }

    /**
     * @param index the index up to which Fib numbers are wanted from the sequence
     * @return a list of Long type Fib numbers
     */
    public static List<Long> getSequence(Long index){

        // if results are already computed, up to the index
        if (dpMap.containsKey(index)){
            return dpMap.values().stream().limit(index + 1).toList();
        }

        // else compute up to the index
        getFibNum(index);

        return dpMap.values().stream().limit(index + 1).toList();
    }
}
