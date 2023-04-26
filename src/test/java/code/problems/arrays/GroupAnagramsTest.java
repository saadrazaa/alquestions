package code.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    @DisplayName("groups anagrams from the given array of strings")
    void groupAnagrams(){
        assertAll(()->{
            assertEquals(GroupAnagrams.group(new String[] {"eat","tea","tan","ate","nat","bat"}),
                    List.of(List.of(new String[] {"eat","tea", "ate"}),
                            List.of(new String[] {"bat"}),
                            List.of(new String[] {"tan","nat"})));
            assertEquals(GroupAnagrams.group(new String[] {""}),
                    List.of(List.of(new String[] {""})));
            assertEquals(GroupAnagrams.group(new String[] {"h", "h", "h"}),
                    List.of(List.of(new String[] {"h", "h", "h"})));
        });
    }
}