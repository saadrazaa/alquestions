package code.problems.trie;

import java.util.List;
import java.util.Set;

/*
Problem:
Given an m x n board of characters and a list of strings words, return all words on the board.

Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.

Constraints:
m == board.length
n == board[i].length
1 <= m, n <= 12
board[i][j] is a lowercase English letter.
1 <= words.length <= 3 * 104
1 <= words[i].length <= 10
words[i] consists of lowercase English letters.
All the strings of words are unique.
 */
public class WordSearchII {

    Set<String> result;

    public static void findWords(List<List<Character>> board, List<String> words){
        System.out.println();
    }

    private static void _dfs(int r, int c, TrieNode node, String word){
        System.out.println();
    }
}
