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
 */
class Solution {
    private  Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }

        return doBuildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode doBuildTree(int[] preorder, int preLeft, int preRight, int[] inorder ,int inLeft, int inRight){
        if(preLeft > preRight){
            return null;
        }

        int rootVal = preorder[preLeft];
        int rootIndexInOrder = map.get(rootVal);
        int leftCount = rootIndexInOrder - inLeft;
        int rightCount = inRight - rootIndexInOrder;

        TreeNode root = new TreeNode(rootVal);
        root.left = doBuildTree(preorder,preLeft + 1,preLeft +leftCount,inorder,inLeft, rootIndexInOrder -1);
        root.right = doBuildTree(preorder,preRight - rightCount+1,preRight,inorder,inRight-rightCount+1,inRight);

        // root.left = doBuildTree(preorder, preLeft + 1, preLeft + leftCount, inorder, inLeft, rootIndexInOrder - inLeft);
        // root.right = doBuildTree(preorder, preLeft + 1 + leftCount, preRight, inorder, rootIndexInOrder + 1, inRight);


        // root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // root.right = myBuildTree(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);


        return root;
    }
}
