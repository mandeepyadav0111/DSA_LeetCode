/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String reserialize(TreeNode root, String ans){
        if(root==null){
            ans+="null,";
        }
        else{
            ans+= ans.valueOf(root.val)+",";
            ans= reserialize(root.left, ans);
            ans= reserialize(root.right, ans);
        }
        return ans;
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return reserialize(root, "");
    }
    
    public TreeNode redeserialize(List<String> list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        TreeNode root= new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left= redeserialize(list);
        root.right= redeserialize(list);
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] tree= data.split(",");
        List<String>list= new ArrayList<>(Arrays.asList(tree));
        return redeserialize(list); 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));