package code.problems.backtracking;

import java.util.*;

/*
Problem:
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Constraints:
m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
 */
public class WordSearch {

    private static int ROWS;
    private static int COLS;
    private static Set<List<Integer>> VISITED;
    private static List<List<Character>> BOARD;
    private static String WORD;

    public static boolean exists(List<List<Character>> board, String word){
        ROWS = board.size();
        COLS = board.get(0).size();

        BOARD = board;
        WORD = word;

        VISITED = new HashSet<>();

        // create a board dictionary, counting frequencies of each word
        Map<Character, Integer> boardDictionary = new HashMap<>();
        for(int r=0; r < ROWS; r++){
            for(int c=0; c < COLS; c++){
                int val = boardDictionary.getOrDefault(BOARD.get(r).get(c), 0);
                boardDictionary.put(BOARD.get(r).get(c), val+1);
            }
        }

        // create a word dictionary, counting frequencies of each word
        Map<Character, Integer> wordDictionary = new HashMap<>();
        for(int r=0; r < WORD.length(); r++){
            int val = wordDictionary.getOrDefault(WORD.charAt(r), 0);
            wordDictionary.put(WORD.charAt(r), val+1);
        }

        for(char c : wordDictionary.keySet()){
            if(boardDictionary.containsKey(c) && boardDictionary.get(c) < wordDictionary.get(c)){
                return false;
            }
        }

        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if (_dfs(r, c, 0)){
                    return true;
                }
            }
        }

        return false;


    }

    private static boolean _dfs(int r, int c, int index){

        if(index == WORD.length()){
            return true;
        }

        if(r < 0 ||
                c < 0 ||
                r == ROWS ||
                c == COLS ||
                VISITED.contains(List.of(r,c)) ||
                WORD.charAt(index) != BOARD.get(r).get(c)){
            return false;
        }

        VISITED.add(List.of(r,c));
        boolean result = _dfs(r+1, c, index+1) ||
                _dfs(r-1, c, index+1) ||
                _dfs(r, c+1, index+1) ||
                _dfs(r, c-1, index+1);

        VISITED.remove(List.of(r,c));

        return result;

    }
}
