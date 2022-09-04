package code.problems.numbers;

import java.util.Objects;

public class GreatestCommonDivisor {

    public static Long find(Long n1, Long n2){

        // rule out args below 1, for which gcd doesn't apply
        // return -1 when solution isn't possible or not found
        if (n1 < 1 || n2 < 1){
            return -1L;
        }

        // return when args are equal
        //base case
        if (Objects.equals(n1, n2)){
            return n1;
        }

        // recurse by subtracting smaller number from the larger one
        if ( n1 < n2){
            return find(n1, n2 - n1);
        }
        else{
            return find(n1 - n2, n2);
        }
    }
}
