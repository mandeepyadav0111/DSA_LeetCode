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
    public void flatten(TreeNode root) {
        flattree(root);
        
    }
    public static TreeNode flattree(TreeNode node){
        if(node==null) return null;
        if(node.left==null && node.right==null) return node;
        TreeNode leftNode= flattree(node.left);
        TreeNode rightNode= flattree(node.right);

        if(leftNode!= null){
            leftNode.right= node.right;
            node.right= node.left;
            node.left= null;
        }
        return rightNode==null ? leftNode : rightNode;

    }
}