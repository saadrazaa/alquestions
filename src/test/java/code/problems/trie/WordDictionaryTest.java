package code.problems.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {

    @Test
    void test(){
        WordDictionary root = new WordDictionary();
        root.addWord("bad");
        root.addWord("mad");
        root.addWord("dad");

        assertAll(()->{
            assertFalse(root.search("pad"));
            assertTrue(root.search("bad"));
            assertTrue(root.search(".ad"));
            assertTrue(root.search("b.."));
        });
    }
}