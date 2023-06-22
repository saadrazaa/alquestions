package code.problems.trie;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchIITest {

    @Test
    void test(){
        List<List<Character>> board1 = List.of(
                List.of('o', 'a', 'a', 'n'),
                List.of('e', 't', 'a', 'e'),
                List.of('i', 'h', 'k', 'r'),
                List.of('i', 'f', 'l', 'v')
        );
        List<String> words1 = List.of("oath", "pea", "eat", "rain");

        List<List<Character>> board2 = List.of(
                List.of('a', 'b'),
                List.of('c', 'd')
        );
        List<String> words2 = List.of("abcb");
        assertAll(()->{
            assertEquals(Set.of("eat", "oath"), new HashSet<>(
                    WordSearchII.findWords(board1, words1)
            ));
            assertEquals(Set.of(), new HashSet<>(
                    WordSearchII.findWords(board2, words2)
            ));
            assertEquals(Set.of("dca"), new HashSet<>(
                    WordSearchII.findWords(board2, List.of("dca"))
            ));
        });
    }
}