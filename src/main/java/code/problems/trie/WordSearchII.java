package code.problems.trie;

import java.util.HashSet;
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

    private static Set<String> result;
    private static Set<List<Integer>> visited;
    private static int ROWS;
    private static int COLS;

    public static List<String> findWords(List<List<Character>> board, List<String> words){
        Trie root = new Trie();
        for(String w: words){
            root.insert(w);
        }

        ROWS = board.size();
        COLS = board.get(0).size();
        result = new HashSet<>();
        visited = new HashSet<>();

        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                _dfs(r, c, board, root.root, "");
            }
        }

        return result.stream().toList();
    }

    private static void _dfs(int r, int c, List<List<Character>> board, TrieNode node, String word){
        if(r < 0 ||
            c < 0 ||
            r == ROWS ||
            c == COLS ||
            visited.contains(List.of(r,c)) ||
            !node.children.containsKey(board.get(r).get(c))){
            return;
        }

        visited.add(List.of(r,c));
        node = node.children.get(board.get(r).get(c));
        word += board.get(r).get(c);

        if(node.endOfWord){
            result.add(word);
        }

        _dfs(r+1, c, board, node, word);
        _dfs(r-1, c, board, node, word);
        _dfs(r, c+1, board, node, word);
        _dfs(r, c-1, board, node, word);

        visited.remove(List.of(r,c));
    }
}
