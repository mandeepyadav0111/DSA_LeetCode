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
    int preorderIndex;
    HashMap<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex=0;
        map= new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0, preorder.length-1);  
    }

    public TreeNode arrayToTree(int[]preorder,int left, int right){
        if(left> right){
            return null;
        }
        int rootValue= preorder[preorderIndex];
        preorderIndex++;
        TreeNode root= new TreeNode(rootValue);
        root.left= arrayToTree(preorder, left, map.get(rootValue)-1);
        root.right= arrayToTree(preorder, map.get(rootValue)+1, right);
        return root;
    }
}