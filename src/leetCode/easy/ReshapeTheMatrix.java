package leetCode.easy;

//https://leetcode.com/problems/reshape-the-matrix/description/
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int mSize = nums.length;
        int nSize = nums[0].length;

        if( mSize*nSize != r*c) return nums;

        int[][] reshape = new int[r][c];
        //배열을 펼친 다음, 다시 정리해준다.
        // 명확할 알고리즘인지 모르겠으나, 두개 테이블을 비교해서 계산함.
        for (int i = 0; i < r*c; i++) {
            reshape[i/c][i%c] = nums[i/nSize][i%nSize];
        }

        return reshape;
    }
}
