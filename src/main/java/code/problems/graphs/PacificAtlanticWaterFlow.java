package code.problems.graphs;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Problem:
There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.

The island is partitioned into a grid of square cells. You are given an m x n integer matrix heights where heights[r][c] represents the height above sea level of the cell at coordinate (r, c).

The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is less than or equal to the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.

Return a 2D list of grid coordinates result where result[i] = [ri, ci] denotes that rain water can flow from cell (ri, ci) to both the Pacific and Atlantic oceans.

Constraints:
m == heights.length
n == heights[r].length
1 <= m, n <= 200
0 <= heights[r][c] <= 105
 */
public class PacificAtlanticWaterFlow {

    private static List<List<Integer>> HEIGHTS;
    private static int ROWS;
    private static int COLS;

    public static List<List<Integer>> calculate(List<List<Integer>> heights){
        ROWS = heights.size();
        COLS = heights.get(0).size();
        HEIGHTS = heights;

        Set<List<Integer>> pacific = new HashSet<>();
        Set<List<Integer>> atlantic = new HashSet<>();

        for(int r = 0; r < ROWS; r++){
            _dfs(r, 0, pacific, HEIGHTS.get(r).get(0));
            _dfs(r, COLS-1, atlantic, HEIGHTS.get(r).get(COLS-1));
        }

        for(int c = 0; c < COLS; c++){
            _dfs(0, c, pacific, HEIGHTS.get(0).get(c));
            _dfs(ROWS-1, c, atlantic, HEIGHTS.get(ROWS-1).get(c));
        }

        pacific.retainAll(atlantic);

        return pacific.stream().toList();

    }

    private static void _dfs(int r, int c, Set<List<Integer>> visited, int prevHeight){
        if( r < 0 ||
            r >= ROWS ||
            c < 0 ||
            c >= COLS ||
            visited.contains(List.of(r,c)) ||
            HEIGHTS.get(r).get(c) < prevHeight){
            return;
        }

        visited.add(List.of(r,c));
        _dfs(r+1, c, visited, HEIGHTS.get(r).get(c));
        _dfs(r-1, c, visited, HEIGHTS.get(r).get(c));
        _dfs(r, c+1, visited, HEIGHTS.get(r).get(c));
        _dfs(r, c-1, visited, HEIGHTS.get(r).get(c));
    }
}
