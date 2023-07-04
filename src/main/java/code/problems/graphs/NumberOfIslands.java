package code.problems.graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Problem:
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
 */
public class NumberOfIslands {

    private static int ISLANDS;
    private static Set<List<Integer>> VISITED;
    private static int ROWS;
    private static int COLS;

    private static List<List<Character>> GRID;

    public static int find(List<List<Character>> grid){
        if(grid.size() == 0){
            return 0;
        }

        ROWS = grid.size();
        COLS = grid.get(0).size();
        GRID = grid;
        ISLANDS = 0;
        VISITED = new HashSet<>();


        for(int r=0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(GRID.get(r).get(c) == '1' && !VISITED.contains(List.of(r,c))){
                    _dfs(r, c);
                    ISLANDS += 1;
                }
            }
        }

        return ISLANDS;
    }

    private static void _dfs(int r, int c){
        if(r < 0 ||
            r >= ROWS ||
            c < 0 ||
            c >= COLS ||
            VISITED.contains(List.of(r,c)) ||
            GRID.get(r).get(c) != '1'){
            return;
        }

        VISITED.add(List.of(r,c));

        _dfs(r+1, c);
        _dfs(r-1, c);
        _dfs(r, c+1);
        _dfs(r, c-1);
    }
}
