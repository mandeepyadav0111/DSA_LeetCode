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
    int maxSum=Integer.MIN_VALUE;
    public int findMax(TreeNode root){
        if(root== null){
            return 0;
        }
        int left= Math.max(findMax(root.left), 0);
        int right= Math.max(findMax(root.right), 0);

        int currentRootSum= root.val+left+right;
        maxSum= Math.max(maxSum, currentRootSum);
        return Math.max(left, right)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        findMax(root);
        return maxSum;
    }
}