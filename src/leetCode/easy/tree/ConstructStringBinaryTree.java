package leetCode.easy.tree;

import java.util.Stack;

//https://leetcode.com/problems/construct-string-from-binary-tree/description/
public class ConstructStringBinaryTree {
    public String tree2str(TreeNode t) {
        StringBuffer sb = new StringBuffer();
        return tree2StrRecursion(t, sb);
    }

    private String tree2StrRecursion(TreeNode t, StringBuffer sb) {
        if (t != null) {
            sb.append(t.val);
        } else {
            return sb.toString();
        }
        if (t.left != null) {
            sb.append("(" + tree2str(t.left) + ")");
        } else if (t.left == null && t.right != null) {
            sb.append("(" + ")");
        }
        if (t.right != null) {
            sb.append("(" + tree2str(t.right) + ")");
        }

        return sb.toString();
    }

    //TODO:Stack을 이용해서 어떻게 풀면 될까??
    private String tree2StrStack(TreeNode t) {
        StringBuffer strBuf = new StringBuffer();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(t);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.val);
            strBuf.append(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return strBuf.toString();
    }
}
