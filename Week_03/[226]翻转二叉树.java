class Solution {
    public TreeNode invertTree(TreeNode root) {
        doInvertTree(root);
        return root;
    }

    private void doInvertTree(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.left = right;
        node.right = left;
        doInvertTree(node.left);
        doInvertTree(node.right);
    }
}


public class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        final TreeNode left = root.left,
                right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
