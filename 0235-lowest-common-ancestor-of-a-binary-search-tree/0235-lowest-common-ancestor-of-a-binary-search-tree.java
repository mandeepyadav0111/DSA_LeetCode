/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parent= root.val;
        int valP= p.val;
        int valQ= q.val;
        if(valQ> parent && valP >parent){
            return lowestCommonAncestor(root.right, p,q);
        }
        if(valQ < parent && valP < parent){
            return lowestCommonAncestor(root.left,p,q);
        }
        else{
            return root;
        }
    }
}