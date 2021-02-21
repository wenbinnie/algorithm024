class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        // int min = -Integer.MAX_VALUE;
        double min = -Double.MAX_VALUE;
        while(!stack.isEmpty()||cur != null){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode pop = stack.pop();
            if(min >= pop.val){
                return false;
            }
            min = pop.val;
            if(pop.right != null){
                cur = pop.right;
            }
        }
        return true;
    }
}


class Solution {
    private TreeNode pre;
    public boolean isValidBST(TreeNode root) {
        if(root == null){
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
