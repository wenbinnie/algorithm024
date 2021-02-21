/**
 * 我们可以用与前序遍历相似的方法完成后序遍历。
 * 后序遍历与前序遍历相对称。
 * 思路： 每到一个节点 A，就应该立即访问它。 然后将左子树压入栈，再次遍历右子树。
 * 遍历完整棵树后，结果序列逆序即可。
 *
 * 栈S;
 * p= root;
 * while(p || S不空){
 *     while(p){
 *         访问p节点；
 *         p的左子树入S;
 *         p = p的右子树;
 *     }
 *     p = S栈顶弹出;
 * }
 * 结果序列逆序;
 *
 * 前序遍历的过程 是 中左右。
 * 将其转化成 中右左。也就是压栈的过程中优先压入左子树，在压入右子树。
 * 然后将这个结果返回来，这里是利用栈的先进后出倒序打印。
 *
 */

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<Integer> res = new Stack<>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.push(cur.val);
            if(cur.left != null){
                stack.push(cur.left);
            }
            if(cur.right != null){
                stack.push(cur.right);
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(!res.isEmpty()){
            ans.add(res.pop());
        }
        return ans;
    }
}

