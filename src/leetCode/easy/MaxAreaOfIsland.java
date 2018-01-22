package leetCode.easy;
//https://leetcode.com/problems/max-area-of-island/description/
// recursion에 약한 것 같다...
public class MaxAreaOfIsland {
    private int direction[][] = {{1,0}, {0,1}, {-1, 0},{0, -1}};
    private int mapSize_X = 0;
    private int mapSize_Y = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        mapSize_X = grid.length;
        mapSize_Y = grid[0].length;
        for (int x = 0; x <mapSize_X; x++) {
            for (int y = 0; y <mapSize_Y; y++) {
                if (grid[x][y] != 0)
                    result = Math.max(result, calMaxArea(grid, x,y));
            }
        }
        return result;
    }

    public int calMaxArea(int [][] grid, int x, int y) {
        //base condition
        if (x < 0 || y < 0 || x > mapSize_X -1 || y > mapSize_Y -1 || grid[x][y] == 0) {
            return 0;
        }

        int lastValue = 1;
        //set to zero. before entering new recursion.
        grid[x][y] = 0;
        for (int i = 0; i < direction.length; i++) {
            lastValue += calMaxArea(grid, x + direction[i][0] , y + direction[i][1]);
        }

        return lastValue;
    }
}
