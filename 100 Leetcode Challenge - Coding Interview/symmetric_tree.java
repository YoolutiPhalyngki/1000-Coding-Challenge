/**
* Definition for a binary tree node.
* public class TreeNode {
*    int val;
*    TreeNode left;
*    TreeNode right;
*    TreeNode() {}
*    TreeNode(int val) { this.val = val; }
*    TreeNode(int val, TreeNode left, TreeNode right) {
*        this.val = val;
*        this.left = left;
*        this.right = right;
*    }
* }
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right)
    }

    public boolean helper(TreeNode treeleft, TreeNode treeright) {
        if (treeleft == null && treeright == null) return true;
        if (treeleft == null || treeright == null || treeleft.val != treeright.val) return false;
        return helper(treeleft.left, treeright.right) && helper(treeleft.right, treeright.left);
    }
}