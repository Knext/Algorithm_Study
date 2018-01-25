package leetCode.easy;

//https://leetcode.com/problems/range-addition-ii/description/
//1.The range of m and n is [1,40000].
//2.The range of a is [1,m], and the range of b is [1,n].
//3.The range of operations size won't exceed 10,000.
//제약 사항을 잘 읽어보면 답이 있다. 결국 최소 면적을 계산하는 문제...
public class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        int opsLen = ops.length;
        if (opsLen == 0) return m*n;
        if (opsLen == 1) return ops[0][0]*ops[0][1];

        int a = ops[0][0];
        int b = ops[0][1];
        for (int l = 1; l < opsLen; l++) { //O(L)
            a = Math.min(a, ops[l][0]);
            b = Math.min(b, ops[l][1]);
        }

        return a*b;
    }
}
