package leetCode.easy.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(TreeNode node) {
        if (this.root == null) {
            root = node;
        } else {
            TreeNode prev = null;
            TreeNode cur = root;
            //마지막 노드를 찾는다.
            while (cur != null) {
                prev = cur;
                if (cur.val <= node.val) {
                    cur = cur.right;
                } else if (cur.val > node.val) {
                    cur = cur.left;
                }
            }
            //마지막 노드 값과 비교해서 왼쪽/오른쪽에 추가.
            if (prev.val > node.val) {
                prev.left = node;
            } else {
                prev.right = node;
            }
        }
    }

    public void delete(TreeNode node) {
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null) {
            if (cur.val < node.val) { //큰값은 오른쪽.
                prev = cur;
                cur = cur.right;
            } else if (cur.val > node.val) {//작은값은 왼쪽
                prev = cur;
                cur = cur.left;
            } else {
                break;
            }
        }
        //prev는 부모, cur은 삭제 대상.
        if (cur.left == null && cur.right == null) { //노드 없는 경우 그냥 삭제.
            if (prev.left == cur) prev.left = null;
            else prev.right = null;
        } else if (cur.right == null) {
            if (prev.left == cur) prev.left = cur.right;
            else prev.right = cur.right;
        } else if (cur.left == null) { // 오른쪽 node 없는 경우
            if (prev.left == cur) prev.left = cur.left;
            else prev.right = cur.left;
        } else { //successor를 찾아서 값을 바꿔주고 successor를 삭제한다.
            TreeNode succ = null;
            prev = null;
            //오른쪽 node가 있는 경우, 오른쪽 node의 최소값.
            if (cur.right != null) {
                succ = node.right;
                while (succ.left != null) {
                    prev = succ;
                    succ = succ.left;
                }
            }

            if (succ == null) {
                //오른쪽 node가 없으면 위로 찾아들어간다.
                //root 부터 찾아서, node value보다 큰 값을 추적...
                TreeNode tempRoot = root;
                while (tempRoot != null) {
                    prev = tempRoot;
                    if (tempRoot.val > cur.val) {
                        succ = tempRoot;
                        tempRoot = tempRoot.left;
                    } else if (tempRoot.val < cur.val) {
                        tempRoot = tempRoot.right;
                    } else {
                        break;
                    }
                }
            }

            //succesor와 삭제할 node의 값을 바꾸고, succesor와 node는 삭제한다.
            cur.val = succ.val;
            prev.left = null;
        }
    }

    public TreeNode search(int val) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val < val) { //큰값은 오른쪽.
                cur = cur.right;
            } else if (cur.val > val) {//작은값은 왼쪽
                cur = cur.left;
            } else {
                break;
            }
        }
        return cur;
    }


    public TreeNode findSuccessor(TreeNode node) {
        TreeNode succ = null;

        //오른쪽 node가 있는 경우, 오른쪽 node의 최소값.
        if (node.right != null) {
            TreeNode min = node.right;
            while (min.left != null) {
                min = min.left;
            }
            return min;
        }

        //오른쪽 node가 없으면 위로 찾아들어간다.
        //root 부터 찾아서, node value보다 큰 값을 추적...
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val > node.val) {
                succ = cur;
                cur = cur.left;
            } else if (cur.val < node.val){
                cur = cur.right;
            } else {
                break;
            }
        }
        return succ;
    }

    public TreeNode findMin() {//가장 왼쪽 첫번째 노드가 최소값.
        TreeNode cur = root;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }

    public TreeNode findMax() { //가장 오른쪽 마지막 노드가 최대값.
        TreeNode cur = root;
        while (cur.right != null) {
            cur = cur.right;
        }
        return cur;
    }

    // Root, Left, Right
    public List<Integer> preOrder() {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            System.out.println(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return result;
    }

    // Left, Root, Left
    public List<Integer> inOrder() {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                result.add(node.val);
                System.out.println(node.val);
                node = node.right;
            }
        }
        return result;
    }

    // Left, Right, Root
    //1,3,2,5,7,6,4
    public List<Integer> postOrder() {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode lastVisitedNode = null;
        while(!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.peek();
                //lastVisit이 없으면, 계속해서 오른쪽으로 들어갔다 나왔다 하는 무한룹에 빠지는 문제 발생.
                if (node.right != null && lastVisitedNode != node.right) {
                    node = node.right;
                } else {
                    result.add(node.val); //peek node
                    System.out.println(node.val);
                    lastVisitedNode = stack.pop();
                    node = null;
                }
            }
        }
        return result;
    }
}
