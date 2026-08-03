import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {
    int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    private int row, cols;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();

        row = heights.length;
        cols = heights[0].length;

        boolean[][] pacific = new boolean[row][cols];
        boolean[][] atlantic = new boolean[row][cols];

        for (int c = 0; c < cols; c++) {
            dfs(0, c, pacific, heights);
            dfs(row - 1, c, atlantic, heights);
        }

        for (int r = 0; r < row; r++) {
            dfs(r, 0, pacific, heights);
            dfs(r, cols - 1, atlantic, heights);
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < cols; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    ans.add(Arrays.asList(r, c));
                }
            }
        }
        return ans;
    }

    private void dfs(int r, int c, boolean[][] visited, int[][] heights) {
        if (visited[r][c])
            return;

        visited[r][c] = true;

        for (int[] d : dir) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr < 0 || nr >= row || nc < 0 || nc >= cols)
                continue;

            if (visited[nr][nc])
                continue;

            if (heights[nr][nc] >= heights[r][c]) {
                dfs(nr, nc, visited, heights);
            }
        }
    }
}
