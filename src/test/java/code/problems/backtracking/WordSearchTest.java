package code.problems.backtracking;

import code.problems.trie.WordSearchII;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    @Test
    void test(){
        List<List<Character>> board = List.of(
                List.of('A', 'B', 'C', 'E'),
                List.of('S', 'F', 'C', 'S'),
                List.of('A', 'D', 'E', 'E')
        );
        String word1 = "ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";

        assertAll(()->{
            assertTrue(WordSearch.exists(board, word1));
            assertTrue(WordSearch.exists(board, word2));
            assertFalse(WordSearch.exists(board, word3));
        });
    }
}