package leetCode.easy;

//https://leetcode.com/problems/island-perimeter/description/
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        int endRow = grid.length;
        int endCol = grid[0].length;
        //왼쪽 모서리부터 오른쪽으로 이동하면서 영역을 계산한다.
        //그리고 다음 행도 동일하게 연산하고, 마지막 행까지 계산 한다.
        for (int row = 0; row < endRow; row++) {
            for (int col = 0; col < endCol; col++) {
                if (grid[row][col] == 1) {
                    //왼쪽
                    if (row == 0 || grid[row-1][col] == 0) {
                        result++;
                    }

                    //오른쪽
                    if (row == endRow-1 || grid[row+1][col] == 0) {
                        result++;
                    }

                    //위
                    if (col == 0 || grid[row][col-1] == 0) {
                        result++;
                    }

                    //아래
                    if (col == endCol-1 || grid[row][col+1] == 0) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
