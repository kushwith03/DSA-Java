package Graphs;

import java.util.LinkedList;
import java.util.Queue;

// LeetCode #200 - Number of Islands
// Given a 2D grid of '1' (land) and '0' (water),
// count the number of islands. An island is surrounded by water
// and is formed by connecting adjacent lands horizontally or vertically.
public class NumberOfIslands {
    public static void bfs() {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    bfsHelper(grid, visited, i, j, rows, cols);
                }
            }
        }
        System.out.println("Number of islands (BFS): " + count);
    }

    private static void bfsHelper(char[][] grid, boolean[][] visited, int row, int col, int rows, int cols) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        visited[row][col] = true;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int d = 0; d < 4; d++) {
                int nr = curr[0] + dr[d];
                int nc = curr[1] + dc[d];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                        && grid[nr][nc] == '1' && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.add(new int[]{nr, nc});
                }
            }
        }
    }

    public static void dfs() {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    dfsHelper(grid, visited, i, j, rows, cols);
                }
            }
        }
        System.out.println("Number of islands (DFS): " + count);
    }

    private static void dfsHelper(char[][] grid, boolean[][] visited, int row, int col, int rows, int cols) {
        if (row < 0 || row >= rows || col < 0 || col >= cols
                || grid[row][col] == '0' || visited[row][col]) return;
        visited[row][col] = true;
        dfsHelper(grid, visited, row - 1, col, rows, cols);
        dfsHelper(grid, visited, row + 1, col, rows, cols);
        dfsHelper(grid, visited, row, col - 1, rows, cols);
        dfsHelper(grid, visited, row, col + 1, rows, cols);
    }
}
