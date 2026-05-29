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
    public List<Integer> inOrder(TreeNode root, List<Integer> list){
        if(root== null){
            return list;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
        return list;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list= new ArrayList<>();
        list=inOrder(root, list);
        return list.get(k-1);
    }
}