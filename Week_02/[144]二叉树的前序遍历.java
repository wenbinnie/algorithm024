/**
 * 容易理解的二叉树遍历模版
 * 递归思路：先树根，然后左子树，然后右子树。每棵子树递归。
 * 在迭代算法中，思路演变成，每到一个节点 A，就应该立即访问它。
 * 因为，每棵子树都先访问其根节点。对节点的左右子树来说，也一定是先访问根。
 * 在 A 的两棵子树中，遍历完左子树后，再遍历右子树。
 * 因此，在访问完根节点后，遍历左子树前，要将右子树压入栈。
 *
 *
 * 栈S;
 * p= root;
 * while(p || S不空){
 *     while(p){
 *         访问p节点；
 *         p的右子树入S;
 *         p = p的左子树;
 *     }
 *     p = S栈顶弹出;
 * }
 *
 */


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                list.add(cur.val);
                stack.push(cur.right);
                cur = cur.left;
            }
            cur = stack.pop();
        }
        return list;
    }
}


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.add(cur.val);
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
        return res;
    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        doPost(root, list);
        return list;
    }
    private void doPost(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }

        list.add(node.val);
        doPost(node.left,list);
        doPost(node.right,list);

    }
}

class Solution {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }

        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
