/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 *
 * 思路：每到一个节点 A，因为根的访问在中间，将 A 入栈。然后遍历左子树，接着访问 A，最后遍历右子树。
 * 在访问完 A 后，A 就可以出栈了。因为 A 和其左子树都已经访问完成。
 *
 * 栈S;
 * p= root;
 * while(p || S不空){
 *     while(p){
 *         p入S;
 *         p = p的左子树;
 *     }
 *     p = S.top 出栈;
 *     访问p;
 *     p = p的右子树;
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list;
    }


    private void inOrder(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }

        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right, list);
    }
}

class Solution {
    private List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }

        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}

/**
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/solution/leetcodesuan-fa-xiu-lian-dong-hua-yan-shi-xbian-2/
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode pop = stack.pop();
            list.add(pop.val);

            if(pop.right != null){
                cur = pop.right;
            }
        }
        return list;
    }
}


class Solution {
    private TreeNode pre;
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            // 正常情况都默认返回true
            return true;
        }

        if(!isValidBST(root.left)){
            return false;
        }

        if(pre != null && pre.val >=  root.val){
            return false;
        }
        pre = root;

        if(!isValidBST(root.right)){
            return false;
        }

        return true;

    }
}
