public class Surface_Area_of_3D_Shapes {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    area += 2;

                    area += 4 * grid[i][j];

                    if (i + 1 < n) {
                        area -= 2 * Math.min(grid[i][j], grid[i + 1][j]);
                    }

                    if (j + 1 < n) {
                        area -= 2 * Math.min(grid[i][j], grid[i][j + 1]);
                    }
                }
            }
        }

        return area;
    }
}
