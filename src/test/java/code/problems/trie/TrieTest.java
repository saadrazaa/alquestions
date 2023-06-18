package code.problems.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void test(){
        Trie root = new Trie();
        root.insert("app");
        root.insert("ape");

        assertAll(()->{
            assertTrue(root.search("app"));
            assertFalse(root.search("h"));
            assertTrue(root.search("ape"));
            assertFalse(root.startsWith("b"));
            assertTrue(root.startsWith("ap"));
        });
    }

}