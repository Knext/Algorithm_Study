package leetCode.easy.tree;
//https://leetcode.com/problems/binary-tree-tilt/description/
// 왼쪽 전체에 대한 합, 오른쪽 전체에 대한 합의 차를 구하는 문제. (헷갈리지 말것..)
public class BinaryTreeTilt {
    int tiltValue = 0;
    public int findTilt(TreeNode root) {
        tiltValue = 0;
        findTiltInner(root);
        return tiltValue;
    }

    int findTiltInner(TreeNode root) {
        if (root == null) return 0;

        int leftSum = findTiltInner(root.left);
        int rightSum = findTiltInner(root.right);

        tiltValue += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
}
